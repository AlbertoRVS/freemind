package com.alberto.freemind.domain


/**
 * Recoge los tipos de tareas y sus valores por defecto
 */
enum class TaskType(val defaultCandies: Int, val spirit: Spirit) {
    PUNCTUAL(2, Spirit.KODAMA),
    MANDATORY(1, Spirit.SUSUWATARI),
    OPTIONAL(5, Spirit.KODAMA)
}

/**
 * Recoge la frecuencia de las tareas
 */
enum class Frequency {
    DAILY,
    WEEKLY
}

/**
 * Recoge los tipos de espíritus que se liberarán al completar la tarea
 */
enum class Spirit {
    SUSUWATARI,
    KODAMA
}
