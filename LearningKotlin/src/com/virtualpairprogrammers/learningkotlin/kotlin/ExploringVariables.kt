package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    //System.out.println("Hello word");

    /*
    var name: String = "Matt"
    val surname: String = "Greencoft" // immutable, value cannot be change

    name = "John"
    //surname = "Something Else" compilation error

    System.out.println(name + " " +  surname)
     */

    var name = "Matt"
    val surname = "Greencroft"

    //println(name + " " + surname)
    println("Hello $name ${surname.uppercase(Locale.getDefault())}")
    println("Your first name has ${name.length} characters")
    //println("Your product cost $about10") // compilation error, there is no variable about10
    println("Your product cost about \$about10")

    //string with multiple lines
    val story = """It was a dog and stormy night
        |A foul smell crept across the city
        |Jane wondered what time it was, and when it would be daylight.""".trimMargin("|")
    println(story)

    val changeStory = story.replaceAfterLast("it", " would be dawn.")
    println(changeStory)

    val myDouble = 21.4
    println("Is myDouble is Double ${myDouble is Double}") // 'is' is like instanceof
    println("myDouble is a ${myDouble::class.qualifiedName}") // check the type kotlin.Double
    println("myDouble's javaClass ${myDouble.javaClass}") // double

    val myInteger = myDouble.roundToInt()
    println("myInteger is a ${myInteger::class.qualifiedName}") // check the type kotlin.Int

    //val anotherInteger : Integer = 17 // compilation error You cannot assigned a Java Integer to kotlin.Int
    val anotherInteger: Int = 17 // compilation error You cannot assigned a Java Integer to kotlin.Int

    val myFloat: Float = 13.6F
    val result = myFloat + anotherInteger
    println(result) // 30.6

    //val bd : BigDecimal = BigDecimal(17)
    val bd = BigDecimal(17)

    val bd2: BigDecimal

    println("hello");

    //println(bd2.abs()) //compilation error, similar to Java bd2 is not yet initialize.

    bd2 = bd.add(BigDecimal(30))


}