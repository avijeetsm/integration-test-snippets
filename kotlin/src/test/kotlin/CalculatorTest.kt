package ti.harness

import org.junit.Assert.assertEquals
import org.junit.Test

import org.junit.jupiter.api.Assertions.*

class CalculatorTest {
    private val calculator = Calculator()

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
}