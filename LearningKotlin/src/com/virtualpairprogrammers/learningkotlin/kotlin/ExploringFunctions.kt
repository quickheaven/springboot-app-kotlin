package com.virtualpairprogrammers.learningkotlin.kotlin

/*
private fun printAsString(value: String) {
    println(value)
}

fun addTwoNumbers(one: Double, two: Double) : Double {
    return one + two
}
*/

// Single line function.
private fun printAsString(value: String) = println(value)

// fun addTwoNumbers(one: Double, two: Double): Double = one + two
fun addTwoNumbers(one: Double, two: Double) = one + two // single line function without the return type

fun addTwoNumbersDefaultValue(one: Double = 6.2, two: Double = 3.9) = one + two // using optional parameters in function

fun printSomeMaths(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    // Functions within a function
    fun functionWithinAFunction(a: String) {
        println(a)
    }
    functionWithinAFunction("Hello")
}

// Example that function that takes a Lambda parameter
//fun methodTakesALambda(input: String, action: java.util.function.Function<String, Int>) { // This is in Java
fun methodTakesALambda(input: String, action: (String) -> Int) {
    println(action(input))
}

fun main(args: Array<String>) {
    printAsString("Hello World")
    println(addTwoNumbers(17.3, 9.6))
    printSomeMaths(17.3, 9.6)

    // Using named parameters when calling functions
    printSomeMaths(two = 17.3, one = 9.6)

    // no need to create overload because we define a default value in the parameter
    println(addTwoNumbersDefaultValue(5.6))
    println(addTwoNumbersDefaultValue(two = 5.6))
}

