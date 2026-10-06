package com.alberto.freemind.domain

import java.time.LocalDate

data class Task(
    val id: Long = 0,
    val title: String,
    val description: String = "",
    val type: TaskType,
    val candies: Int = type.defaultCandies,
    val dueDate: LocalDate? = null,
    val frequency: Frequency? = null,
    val isArchived: Boolean = false
)