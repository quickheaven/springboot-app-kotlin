package com.virtualpairprogrammers.learningkotlin.kotlin

import java.lang.Math.sqrt
import kotlin.math.roundToInt
import kotlin.reflect.full.declaredFunctions

fun isPrime(a: Int): Boolean {
    val maxNumberToCheck = sqrt(a.toDouble()).roundToInt()
    for (i in 2..maxNumberToCheck) if (a % i == 0) return false
    return true
}

fun main(args: Array<String>) {
    val myList = listOf(14, 15, 16, 17, 18, 19, 20)
    // val primeNumber = myList.filter { isPrime(it) }
    val primeNumber = myList.filter(::isPrime) // reflection
    println(primeNumber)

    val functions = myList::class.declaredFunctions
    println(functions)
}