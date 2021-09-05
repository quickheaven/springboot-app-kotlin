package com.virtualpairprogrammers.learningkotlin.kotlin

import java.math.BigDecimal

interface BookingManager {

    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerID: Long): Boolean

    fun SystemStatus() = "All Operations are Functional"
}

class UnauthorisedUserException : Throwable()

open class BasicBookingManager(authorisationKey: String) :
    BookingManager { // all classes in Kotlin is Final by default. to make not final, we can use "open" keyword.

    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerID: Long) = false

    init {
        if (authorisationKey != "12345") throw UnauthorisedUserException()
    }

}

class AdvancedBookingManager : BasicBookingManager("1234"), java.io.Closeable { // implement multiple interface

    override val version = "2.0"

    fun howManyBookings() = 10

    override fun close() {}
}

/*
fun toSentenceCase(a: String): String {
    return a[0].toUpperCase() +  a.substring(1)
}
*/

fun String.toSentenceCase(): String { // add function to classes even on java class.
    return this[0].toUpperCase() + this.substring(1)
}


fun main(args: Array<String>) {
    AdvancedBookingManager().isSeatFree(Seat(1, 1, BigDecimal.ZERO, ""))

    val myList = mutableListOf<Int>()

    val greeting = "welcome to the system"
    println(greeting.toSentenceCase())
}

