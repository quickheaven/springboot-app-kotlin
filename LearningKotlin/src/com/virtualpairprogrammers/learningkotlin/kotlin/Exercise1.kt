package com.virtualpairprogrammers.learningkotlin.kotlin

import java.util.*

fun main(args: Array<String>) {

    val john = KotlinPerson(1, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3))
    val jane = KotlinPerson(1, "Mrs", "Jane", "Green", null)
    println("$john's age is ${john.age}")
    println("$jane's age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is ${KotlinPerson.getAge(GregorianCalendar(1988, 5, 3))}")

}