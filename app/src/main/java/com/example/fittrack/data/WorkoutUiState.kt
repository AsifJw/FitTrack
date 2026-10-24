package com.example.fittrack.data

data class WorkoutUiState (
    val totalWorkouts: Int = 0,
    val totalMinutes: Int = 0,
    val history: List<WorkoutLog> = emptyList()

    )