package com.virtualpairprogrammers.learningkotlin.kotlin

import java.util.*

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
}