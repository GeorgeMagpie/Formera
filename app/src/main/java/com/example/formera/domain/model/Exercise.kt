package com.example.formera.domain.model

data class Exercise(
    val id: Long = 0,
    val name: String,
    val category: ExerciseCategory,
    val notes: String = "",
    val isBodyweight: Boolean = true
)
    enum class ExerciseCategory {
        PUSH,
        PULL,
        LEGS,
        CORE,
        CARDIO,
        OTHER
    }



