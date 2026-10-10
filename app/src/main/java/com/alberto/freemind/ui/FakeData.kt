package com.alberto.freemind.ui

import com.alberto.freemind.domain.Frequency
import com.alberto.freemind.domain.Task
import com.alberto.freemind.domain.TaskType
import java.time.LocalDate


val fakeTasks = listOf(
    Task(
        id = 1,
        title = "Ir al médico",
        type = TaskType.PUNCTUAL,
        dueDate = LocalDate.now().plusDays(2)
    ),
    Task(
        id = 2,
        title = "Elegir estancia Japon",
        type = TaskType.PUNCTUAL,
        dueDate = LocalDate.now()
    ),
    Task(
        id = 3,
        title = "Lavar los platos",
        type = TaskType.MANDATORY,
        frequency = Frequency.DAILY
    ),
    Task(
        id = 4,
        title = "Limpiar arena de gatas",
        type = TaskType.MANDATORY,
        frequency = Frequency.DAILY
    ),
    Task(
        id = 5,
        title = "Ir a comprar a FamilyCash",
        type = TaskType.MANDATORY,
        frequency = Frequency.WEEKLY
    ),
    Task(
        id = 6,
        title = "Cortarme el pelo",
        type = TaskType.OPTIONAL,
        dueDate = LocalDate.now().plusDays(4)
    ),
    Task(
        id = 7,
        title = "Mirar precios de lavadoras",
        type = TaskType.PUNCTUAL,
        dueDate = LocalDate.now().plusDays(3)
    ),
    Task(
        id = 8,
        title = "Comprar algo bonito a Nadine en el Lidl",
        type = TaskType.OPTIONAL,
        dueDate = LocalDate.now().plusDays(1)
    ))