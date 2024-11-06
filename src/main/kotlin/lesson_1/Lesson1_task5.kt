package org.example.lesson_1

fun main() {
    val secondOfFlight = 6480
    val hour = 6400 / 3600
    val minute = (secondOfFlight - (hour * 3600)) / 60
    val second = (secondOfFlight - (minute * 60) - (hour * 3600))
    println("Time of flight: ${"%02d".format(hour)}:${"%02d".format(minute)}:${"%02d".format(second)}")
}