package com.example.fittrack.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fittrack.data.WorkoutUiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    uiState: WorkoutUiState,
    onCategoryClick: (String) -> Unit,
    onClearLogs: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("FitTrack") })
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).padding(16.dp)) {
            Card {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Total number of workouts: ${uiState.totalWorkouts}")
                    Text("Total minutes: ${uiState.totalMinutes}")
                }
            }
        }
    }
}