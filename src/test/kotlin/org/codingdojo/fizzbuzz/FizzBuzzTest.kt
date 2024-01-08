package org.codingdojo.fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `should print 1 when number is 1`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("1", fizzBuzz.print(1))
    }

    @Test
    fun `should print Fizz when number is 3`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz", fizzBuzz.print(3))
    }

    @Test
    fun `should print Buzz when number is 5`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Buzz", fizzBuzz.print(5))
    }

    @Test
    fun `should print Fizz when number is 6`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz", fizzBuzz.print(6))
    }

    @Test
    fun `should print Buzz when number is 10`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Buzz", fizzBuzz.print(10))
    }

}

