package com.alberto.freemind.domain

import java.time.DayOfWeek
import java.time.LocalDate


/** Devuelve mensaje si no cumple estas reglas*/
fun Task.validationError(): String? = when {
    title.isBlank() -> "el Título de la tarea esta vacío."
    type == TaskType.PUNCTUAL && dueDate == null -> "Debes definir una fecha para esta tarea."
    type == TaskType.MANDATORY && frequency == null -> "Debes definir una frecuencia para esta tarea."
    candies < 1 -> "La tarea debe tener recompensa"
    else -> null //null si todo correcto
}

/** Dice si una tarea esta pendiente o no */
fun Task.isPending(lastCompletion: LocalDate?, today: LocalDate): Boolean = when (type) {
    TaskType.PUNCTUAL -> !isArchived
    TaskType.OPTIONAL -> true
    TaskType.MANDATORY -> when (frequency) {
        Frequency.DAILY -> lastCompletion == null || lastCompletion.isBefore(today)
        Frequency.WEEKLY -> lastCompletion == null || lastCompletion.isBefore(today.with(DayOfWeek.MONDAY))
        null -> !isArchived
    }
}
