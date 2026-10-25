package com.example.fittrack.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.fittrack.data.WorkoutLog
import com.example.fittrack.data.WorkoutUiState

class WorkoutViewModel : ViewModel() {
    var uiState by mutableStateOf(WorkoutUiState())
        private set
        private var nextLogId = 1

    fun logWorkout(exerciseName: String, minutes: Int) {
        val newLog = WorkoutLog(
            id = nextLogId,
            exerciseName = exerciseName,
            durationMins = minutes
        )
        nextLogId++

        uiState = uiState.copy(
            totalWorkouts = uiState.totalWorkouts + 1,
            totalMinutes = uiState.totalMinutes + minutes,
            history = listOf(newLog) + uiState.history
        )
    }
    fun clearLogs() {
        uiState = WorkoutUiState()
    }
    }