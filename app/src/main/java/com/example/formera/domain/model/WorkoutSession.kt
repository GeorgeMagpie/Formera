package com.example.formera.domain.model

data class WorkoutSession(
    val id: Long = 0,
    val templateId: Long?,
    val startedAt: Long,
    val finishedAt: Long? = null,
    val notes: String = "",
    val isFinished: Boolean = false
)
