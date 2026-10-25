package com.example.fittrack.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fittrack.data.ExerciseData
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
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Total number of workouts: ${uiState.totalWorkouts}")
                    Text("Total minutes: ${uiState.totalMinutes}")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            ExerciseData.categories.chunked(2).forEach { pair ->
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    pair.forEach { category ->
                        Card(
                            onClick = { onCategoryClick(category) },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = category,
                                modifier = Modifier.padding(24.dp)
                            )
                        }
                    }
                }
            }
            Button(onClick = onClearLogs, modifier = Modifier.fillMaxWidth()) { Text("Clear History") }
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Workout History",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (uiState.history.isEmpty()) {
                Text("No category selected yet. Select a category above to get started!")
            } else {
                LazyColumn(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(uiState.history, key = { it.id }) { log ->
                        Card(modifier = Modifier.fillMaxWidth()) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(log.exerciseName)
                                Text("${log.durationMins} minutes")
                            }
                        }
                    }
                }
            }

        }
    }
}