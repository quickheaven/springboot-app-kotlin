package com.virtualpairprogrammers.learningkotlin.kotlin

fun main(args: Array<String>) {
    val colors = listOf("Red", "Green", "Blue")

    println(colors::class.qualifiedName) // java.util.Arrays.ArrayList

    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    val numbers = mutableListOf<Int>()

    //val months = setOf("Jan", "Feb")
    val months = mutableSetOf("Jan", "Feb")

    val webColors = mapOf("red" to "ff0000", "blue" to "00ff00")

    //val intArray = arrayOf(1,2,3,4)
    //val intArray : Array<Int> = arrayOf(1,2,3,4)
    val intArray: IntArray = intArrayOf(1, 2, 3, 4) // cannot change size
    intArray.set(1, -4)
    intArray[3] = -7
    intArray.forEach { println(it) }

    println(colors[2])
}