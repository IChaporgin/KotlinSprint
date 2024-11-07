package org.example.lesson_1

fun main() {
    val totalSeondOfFloght = 6480
    val secondInHour = 3600
    val minuteInHour = 60
    val hourOfFlight = totalSeondOfFloght / secondInHour
    val reamningSecond = totalSeondOfFloght % secondInHour
    val minuteOfFlight = reamningSecond / minuteInHour
    val secondOfFlight = reamningSecond % minuteInHour
    println("Time of flight: ${"%02d".format(hourOfFlight)}:${"%02d".format(minuteOfFlight)}:${"%02d".format(secondOfFlight)}")
}