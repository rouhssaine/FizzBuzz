package org.codingdojo.fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `should print 1 when number is 1`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("1", fizzBuzz.print(1))
    }

}

