package com.virtualpairprogrammers.learningkotlin.kotlin

import java.util.*

data class KotlinPerson(
    val id: Int,
    val title: String,
    val firstName: String,
    val surname: String,
    val dateOfBirth: Calendar?
) {

    override fun toString(): String {
        return "$title $firstName $surname"
    }

    val age = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int {
            if (dateOfBirth == null) return -1
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) {
                return years - 1
            } else {
                return years
            }
        }
    }

}