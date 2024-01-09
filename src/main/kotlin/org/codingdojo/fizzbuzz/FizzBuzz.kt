package org.codingdojo.fizzbuzz

import java.util.function.Predicate

class FizzBuzz {

    fun print(number: Int): String {
        val result = FizzBuzzCode.entries
            .filter { e -> e.isMultipleOf.test(number) }
            .joinToString (separator = "") { e -> e.value }

        return result.ifEmpty { number.toString() }
    }

    private enum class FizzBuzzCode(val isMultipleOf: Predicate<Int>, val value: String) {
        FIZZ({ number -> number % 3 == 0 }, "Fizz"),
        BUZZ({ number -> number % 5 == 0 }, "Buzz");
    }

}
