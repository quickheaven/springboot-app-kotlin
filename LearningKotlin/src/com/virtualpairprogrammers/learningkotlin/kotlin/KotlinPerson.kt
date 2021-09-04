package com.virtualpairprogrammers.learningkotlin.kotlin

import java.util.*

data class KotlinPerson(
    val id: Int,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: Calendar?
) {

    var favoriteColor: String? = null

    val hello = "Hello World"
    val uppercaseHello = hello.toUpperCase();
    val uppercaseHello1 = hello.let { x -> x.toUpperCase() } // The Let function
    val uppercaseHello2 = hello.let { it.toUpperCase() } // The Let function

    fun getLastLetter(a: String) = a.takeLast(1)

    fun getUpperCaseColor(): String {
        return favoriteColor?.toUpperCase() ?: ""
    }

    fun getLastLetterOfColor(): String {
        // if favoriteColor is not null then we are going to use the let function
        // if favoriteColor is null then return an empty string.
        return favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    fun getColorType(): String {
        val color = getUpperCaseColor()
        // compare by value ==
        // compare by reference used ===
        /*
        return if (color == "")
            "empty"
        else if (color == "RED" || color == "BLUE" || color == "GREEN")
            "rgb"
        else
            "other"
        */
        return when (color) {
            "" -> "empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }
    }

    override fun toString(): String {
        return "$title $firstName $surname"
    }

    val safeAge: Int
        /*
        get() {
            return age != null ? age : -1 // Java style
        }
        get() {
            return age ?: -1 // Elvis operator
        }
        */
        get() = age ?: -1 // shorter version

    val age: Int? = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth == null) return -1
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }

}