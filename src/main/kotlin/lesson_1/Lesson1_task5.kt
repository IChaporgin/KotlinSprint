package org.example.lesson_1

fun main() {
    val totalSecondOfFlight = 6480

    val hourOfFlight = totalSecondOfFlight / SECOND_IN_HOUR
    val remaningSecond = totalSecondOfFlight % SECOND_IN_HOUR
    val minuteOfFlight = remaningSecond / MINUTE_IN_HOUR
    val secondOfFlight = remaningSecond % MINUTE_IN_HOUR
    println("Time of flight: ${"%02d".format(hourOfFlight)}:${"%02d".format(minuteOfFlight)}:${"%02d".format(secondOfFlight)}")
}
const val SECOND_IN_HOUR = 3600
const val MINUTE_IN_HOUR = 60