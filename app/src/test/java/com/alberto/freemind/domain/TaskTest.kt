package com.alberto.freemind.domain

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TaskTest {
    @Test
    fun punctualTaskHasTwoCandiesByDefault() {
        val task1 = Task(title = "tarea1", type = TaskType.PUNCTUAL)

        println("tipo: ${task1.type.name} , caramelos: ${task1.candies}")
        assertEquals(2, task1.candies)
    }


}