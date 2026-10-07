package com.alberto.freemind.domain

import org.junit.Assert.*
import org.junit.Test
import java.time.DayOfWeek
import java.time.LocalDate

class TaskRulesTest {
    @Test
    fun `validation no title error`() {
        val task1 = Task(title = "", type = TaskType.PUNCTUAL)
        assertEquals("el Título de la tarea esta vacío.", task1.validationError())
    }

    @Test
    fun `validation no date on punctual error`() {
        val task2 = Task(title = "Ir al dentista", type = TaskType.PUNCTUAL, dueDate = null)
        assertEquals("Debes definir una fecha para esta tarea.", task2.validationError())
    }

    @Test
    fun `validation frequency on mandatory error`() {
        val task3 = Task(title = "Lavar los platos", type = TaskType.MANDATORY, frequency = null)
        assertEquals("Debes definir una frecuencia para esta tarea.", task3.validationError())
    }

    @Test
    fun `validation less than one candy error`() {
        val task4 = Task(
            title = "Lavar los platos",
            type = TaskType.MANDATORY,
            frequency = Frequency.DAILY,
            candies = 0
        )
        assertEquals("La tarea debe tener recompensa", task4.validationError())
    }

    @Test
    fun `validation ok`() {
        val task5 = Task(
            title = "Lavar los platos",
            type = TaskType.MANDATORY,
            frequency = Frequency.DAILY,
            candies = 1
        )
        assertNull(task5.validationError())
    }


    private val today = LocalDate.of(2026, 10, 7)   // miércoles, lo usan todos los tests
    private val monday = today.with(DayOfWeek.MONDAY)
    @Test
    fun `archived punctual task is not pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.PUNCTUAL,
            dueDate = today.plusDays(2),   // la cita es el viernes
            isArchived = true
        )
        assertFalse(task.isPending(lastCompletion = null, today = today))
    }

    @Test
    fun `non archived punctual is pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.PUNCTUAL,
            dueDate = today.plusDays(2),   // la cita es el viernes
            isArchived = false
        )
        assertTrue(task.isPending(lastCompletion = null, today = today))
    }

    @Test
    fun `optional task is always pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.OPTIONAL,
        )
        assertTrue(task.isPending(today.minusDays(2), today = today))
    }

    /** Al ser diaria, debe estar Pendiente ya que la ultima vez que se completó fue Ayer */
    @Test
    fun `mandatory daily completion yesterday is pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.MANDATORY,
            frequency = Frequency.DAILY,
        )
        assertTrue(task.isPending(today.minusDays(1), today = today))
    }

    /** Debe ser pendiente si nunca se completó o la última vez no fue today.*/
    @Test
    fun `mandatory daily null completion is pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.MANDATORY,
            frequency = Frequency.DAILY,
        )
        assertTrue(task.isPending(null, today = today))
    }

    /** Al completarse la tarea esta semana, debe salir como NO pendiente */
    @Test
    fun `mandatory weekly yesterday completion is not pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.MANDATORY,
            frequency = Frequency.WEEKLY,
        )
        assertFalse(task.isPending(today.minusDays(1), today = today))
    }

    /** Al completarse la tarea hace 9 días, debe salir como pendiente */
    @Test
    fun `mandatory weekly last week completion is pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.MANDATORY,
            frequency = Frequency.WEEKLY,
        )
        assertTrue(task.isPending(today.minusDays(9), today = today))
    }

    @Test
    fun `mandatory weekly done on monday is not pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.MANDATORY,
            frequency = Frequency.WEEKLY,
        )
        assertFalse(task.isPending(monday, today))
    }

    @Test
    fun `mandatory weekly done on sunday is pending`() {
        val task = Task(
            title = "Ir al médico",
            type = TaskType.MANDATORY,
            frequency = Frequency.WEEKLY,
        )
        assertTrue(task.isPending(monday.minusDays(1), today))
    }

}