package com.virtualpairprogrammers.learningkotlin.kotlin

import java.io.FileInputStream

@Throws(InterruptedException::class) // This annotation for Java programmers to handle the exception
fun divide(a: Int, b: Int): Double {
    Thread.sleep(1000)
    return (a.toDouble() / b)
}

fun printFile() {
    val input = FileInputStream("file.txt")
    // equivalent try catch resources in java
    input.use {
        // an exception could be thrown here
    }
}

fun main(args: Array<String>) {
    /*
    try {
        println(7 / 0)
    } catch (e: ArithmeticException) {
        println("caught")
    }
    Thread.sleep(1000) // all exception is un-check in Kotlin (this is done for functional programming)
    */

    // divide(5, 23)
    var result = try {
        divide(5, 23)
    } catch (e: Exception) {
        println(e)
        0
    }
    println(result)
}