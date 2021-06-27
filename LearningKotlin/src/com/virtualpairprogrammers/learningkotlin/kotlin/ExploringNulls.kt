package com.virtualpairprogrammers.learningkotlin.kotlin

fun main(args: Array<String>) {

    //var name: String = null // compilation error
    var name: String? = null

    //name = "Matt" uncomment this line and next line will be able to compile because of smart cast.
    //println(name.toUpperCase()) compilation error

    /*
     * Non Kotlin solution
    if (name != null) {
        println(name.toUpperCase())
    }
    */

    //println("${name}".toUpperCase()) //results to NULL

    println(name?.toUpperCase()) //  ? is the Null-Safe Operator -- run the method if its safe to run.

    println(name!!.toUpperCase()) // !! is the Non-Null asserted operator --> can cause null pointer, do not use this and avoid.

    //var address = null // Nothing --> value do not exists
    //address = "Hello" // Compilation error because the type of address is Nothing

    var address: String? = null
    address = "Hello"

    var myInteger: Int? = 7
    myInteger = null


}