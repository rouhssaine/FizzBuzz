package org.codingdojo.fizzbuzz

class FizzBuzz {

    fun print(number: Number): String {
        if(number == 3) return "Fizz"
        if(number == 5) return "Buzz"
        return number.toString()
    }
}
