package com.example.fittrack.data

data class Exercise (
    val id: Int,
    val name: String,
    val category: String,
    val difficulty: String,
    val preview: String,
    val steps: List<String>,
    val recommendedMinutes: Int
)