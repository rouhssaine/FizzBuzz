package org.codingdojo.fizzbuzz

class FizzBuzz {

    fun print(number: Int): String {
        if(number % 3 == 0) return "Fizz"
        if(number % 5 == 0) return "Buzz"
        return number.toString()
    }
}
