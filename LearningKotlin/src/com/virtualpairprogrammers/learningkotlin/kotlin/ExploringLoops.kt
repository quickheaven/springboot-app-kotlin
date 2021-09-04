package com.virtualpairprogrammers.learningkotlin.kotlin

fun main(args: Array<String>) {

    var x: Int = 0

    while (x < 10) {
        println(x)
        x++
    }

    val people = ArrayList<KotlinPerson>()
    people.add(KotlinPerson(1, "Mr", "James", "Apple", null))
    people.add(KotlinPerson(2, "Miss", "Sophie", "Orange", null))
    people.add(KotlinPerson(3, "Mrs", "Anita", "Kumkwat", null))
    people.add(KotlinPerson(4, "Mr", "Darren", "Banana", null))

    for (person: KotlinPerson in people) {
        println(person)
    }
    for (person in people) {
        println(person)
    }
    // Destructure #1
    for (person in people) {
        val (id, title) = person
        println("$person has id $id")
    }
    // Destructure #2
    for ((id, title, firstName) in people) {
        println("$title $firstName has id $id")
    }

    val peopleMap = HashMap<Int, KotlinPerson>()
    peopleMap.put(1, KotlinPerson(1, "Mr", "James", "Apple", null))
    peopleMap.put(2, KotlinPerson(2, "Miss", "Sophie", "Orange", null))
    peopleMap.put(3, KotlinPerson(3, "Mrs", "Anita", "Kumkwat", null))
    peopleMap.put(4, KotlinPerson(4, "Mr", "Darren", "Banana", null))
    for ((key, value) in peopleMap) {
        println("$value has key $key")
    }

    /* Java For Loop
    for (int = 0; i < 10; i++) {
        println(i)
    }
    */
    // looping with the range
    for (i in 0..9) { // standard java for loop
        println(i)
    }

    (0..9).forEach { i -> println(i) }

    (0..9).forEach { println(it) }

    (9 downTo 0).forEach { println(it) }
    (0 until 9).forEach { println(it) }
    (0..9 step 2).forEach { println(it) }
    ('A'..'F').forEach { println(it) }
}