package com.virtualpairprogrammers.theater.domain

import javax.persistence.*

@Entity
data class Booking(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    val id: Long,

    @Column(name = "customer_name")
    val customerName: String
) {
    constructor() : this(0, "")

    @ManyToOne
    lateinit var seat: Seat

    @ManyToOne
    lateinit var performance: Performance
}