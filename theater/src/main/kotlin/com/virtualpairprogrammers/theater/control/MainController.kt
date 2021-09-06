package com.virtualpairprogrammers.theater.control

import com.virtualpairprogrammers.theater.data.SeatRepository
import com.virtualpairprogrammers.theater.services.BookingService
import com.virtualpairprogrammers.theater.services.TheaterService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @Autowired
    lateinit var theaterService: TheaterService // lateinit do not worry it will be initialize later on.

    @Autowired
    lateinit var bookingService: BookingService

    @Autowired
    lateinit var seatRepository: SeatRepository

    /*
    @RequestMapping("helloWorld")
    fun helloWord(): ModelAndView {
        return ModelAndView("helloWorld")
    }
    */

    @RequestMapping("helloWorld")
    fun helloWord(): ModelAndView = ModelAndView("helloWorld")

    /*
    fun homePage() : ModelAndView {
        return ModelAndView("seatBooking", "bean", CheckAvailabilityBackingBean())
    }
     */
    @RequestMapping("")
    fun homePage(): ModelAndView = ModelAndView("seatBooking", "bean", CheckAvailabilityBackingBean())

    @RequestMapping("checkAvailability", method = [RequestMethod.POST])
    fun checkAvailability(bean: CheckAvailabilityBackingBean): ModelAndView {
        val selectedSeat = theaterService.find(bean.selectedSeatNum, bean.selectedSeatRow)
        var result = bookingService.isSeatFree(selectedSeat)
        bean.result = "Seat $selectedSeat is " + if (result) "available" else "booked"
        return ModelAndView("seatBooking", "bean", bean)
    }

    @RequestMapping("bootstrap")
    fun createInitialData(): ModelAndView {
        val seats = theaterService.seats
        seatRepository.saveAll(seats)
        return homePage()
    }

}

class CheckAvailabilityBackingBean {
    val seatNums = 1..36
    val seatRows = 'A'..'O'
    var selectedSeatNum: Int = 1
    var selectedSeatRow: Char = 'A'
    var result: String = ""

}