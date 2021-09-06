package com.virtualpairprogrammers.theater.domain

import javax.persistence.*

@Entity
data class Performance(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "performance_id")
    val id: Long,

    @Column(name = "performance_title")
    val title: String,

    ) {

    constructor() : this(0, "")

    @OneToMany(mappedBy = "performance")
    lateinit var bookings: List<Booking>

}