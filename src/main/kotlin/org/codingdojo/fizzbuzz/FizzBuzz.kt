package org.codingdojo.fizzbuzz

class FizzBuzz {

    fun print(number: Int): String {
        if(isMultipleOf(number, 3)) return "Fizz"
        if(isMultipleOf(number, 5)) return "Buzz"
        return number.toString()
    }

    private fun isMultipleOf(number: Int, divider: Int) = number % divider == 0
}
