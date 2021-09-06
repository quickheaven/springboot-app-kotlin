package com.virtualpairprogrammings.application

import com.virtualpairprogrammings.utilities.toSentenceCase

fun applySomeFunctionToAsString(inputString: String, myFunction: (String) -> String): String {
    return myFunction(inputString)
}

fun main(args: Array<String>) {
    // val result = applySomeFunctionToAsString("hello") { x -> x.toUpperCase() + x.substring(1) }
    val result = applySomeFunctionToAsString("hello", ::toSentenceCase) // reflection syntax. regular kotlin code
    val result2 =
        applySomeFunctionToAsString("hello") { it.toUpperCase() } // no need to give a name like 'x', we can simply use 'it'
    println(result)
    println(result2)

    val colors = listOf("red", "green", "blue", "black")
    val uppercaseColors = colors.map { it.toUpperCase() }
    uppercaseColors.forEach { println(it) }

    val colorStartingWithB = colors.filter { it.startsWith("b") }
    colorStartingWithB.forEach { println(it) }

    colors.flatMap { if (it.startsWith("b")) listOf(it, it) else listOf(it) }.forEach { println(it) }

    colors.reduce { result, value -> result + value + ", " }
    println(colors.reduce { result, value -> "$result,$value" })

    var numbers = colors.map { it.length }
    numbers.forEach { println(it) }

    println(numbers.sum());
    println(numbers.average());
    println(numbers.count());

    println(numbers.fold(0) { result, value -> result + value }) // same as .sum()
    println(numbers.fold(0) { result, value -> if (value > result) value else result })

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap.filter { (k, v) -> v.startsWith("t") }
        .forEach { (k, v) -> println("$k $v") } // (k, v) mean de-structure the map to key value or use 'it' like the next line
    myMap.filter { it.value.startsWith("t") }.forEach { (k, v) -> println("$k $v") }
}