package com.example.fittrack.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.fittrack.data.ExerciseData
import com.example.fittrack.viewmodel.WorkoutViewModel

@Composable
fun FitTrackApp() {
    val navController = rememberNavController()
    val viewModel: WorkoutViewModel = viewModel()

    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") {
            DashboardScreen(
                uiState = viewModel.uiState,
                onCategoryClick = { category -> navController.navigate("exercises/$category") },
                onClearLogs = { viewModel.clearLogs() }
            )
        }
        composable(
            route = "exercises/{category}",
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            ExerciseListScreen(
                category = category,
                exercises = ExerciseData.getExercisesByCategory(category),
                onExerciseClick = { id -> navController.navigate("details/$id") },
                onBack = { navController.popBackStack() }
            )
        }
        composable(
            route = "details/{exerciseId}",
            arguments = listOf(navArgument("exerciseId") { type = NavType.IntType })
        ) { backStackEntry ->
            val exerciseId = backStackEntry.arguments?.getInt("exerciseId") ?: 0
            ExerciseDetailScreen(
                exercise = ExerciseData.getExerciseById(exerciseId),
                onLogWorkout = { name, minutes -> viewModel.logWorkout(name, minutes) },
                onBack = { navController.popBackStack() }
            )
        }
    }
}