package org.example.Lesson_11_22

fun main() {
    val weather1 = NewWeather(25.4, 18.1, false)
    val weather2 = NewWeather(17.3, 16.1, true)
    weather1.showWeather()
    println()
    weather2.showWeather()
    weather1.dayTemperature = 30.1
}

class NewWeather(var dayTemperature: Double, var nightTemperature: Double, var precipitation: Boolean) {

    fun showWeather() {
        println("Дневная температура: $dayTemperature\nНочная температура: $nightTemperature\nОсадки: $precipitation")
    }
}