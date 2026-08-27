package com.example.formera.domain.model

data class TemplateExercise(
    val id: Long = 0,
    val templateId: Long,
    val exerciseId: Long,
    val position: Int,
    val targetSets: Int = 3,
    val targetRepMin: Int = 6,
    val targetRepMax: Int = 12,
    val restSeconds: Int = 120
)
