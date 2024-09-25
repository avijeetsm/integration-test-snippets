package ti.harness

import org.junit.Assert.assertEquals
import org.junit.Test

import org.junit.jupiter.api.Assertions.*

class Calculator2Test {
    private val calculator = Calculator2()

    @Test
    fun add() {
        val result = calculator.add(5, 3)
        assertEquals(8, result)
    }

    @Test
    fun subtract() {
        val result = calculator.subtract(5, 3)
        assertEquals(2, result)
    }

    @Test
    fun raise() {
        val result = calculator.raise(5)
        assertEquals(7, result)
    }
}