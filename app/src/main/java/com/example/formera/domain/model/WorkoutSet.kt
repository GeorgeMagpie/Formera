package com.example.formera.domain.model

data class WorkoutSet(
    val id: Long = 0,
    val sessionId: Long,
    val exerciseId: Long,
    val setNumber: Int,
    val reps: Int,
    val additionalWeightKg: Double = 0.0,
    val rpe: Double? = null,
    val restSeconds: Int? = null,
    val isCompleted: Boolean = true
)
