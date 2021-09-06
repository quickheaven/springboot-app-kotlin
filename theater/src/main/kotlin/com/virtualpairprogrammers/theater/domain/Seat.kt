package com.virtualpairprogrammers.theater.domain

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Seat(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_id")
    val id: Long,

    @Column(name = "seat_row")
    val row: Char,

    @Column(name = "seat_num")
    val num: Int,

    @Column(name = "seat_price")
    val price: BigDecimal,

    @Column(name = "seat_description")
    val description: String
) {
    constructor() : this(0, Character.MIN_VALUE, 0, BigDecimal.ZERO, "")

    override fun toString(): String = "Seat $row-$num $$price ($description)"
}