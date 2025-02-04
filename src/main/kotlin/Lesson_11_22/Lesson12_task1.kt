package org.example.Lesson_11_22

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()
    weather1.showWeather()
    println()
    weather2.showWeather()
    weather1.dayTemperature = 28.3
    weather1.nightTemperature = 18.3
    weather1.precipitation = true
    weather2.dayTemperature = 17.3
    weather2.nightTemperature = 14.1
    weather2.precipitation = true
    println()
    weather1.showWeather()
    println()
    weather2.showWeather()
}