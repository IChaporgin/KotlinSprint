package org.example.Lesson_12

fun main() {
    val weather1 = NewWeather(300, 280)
    weather1.showWeather()

}

class NewWeather(dayTemperature: Int, nightTemperature: Int,) {
    val day: Int
    val night: Int
    private val kelvin = 273

    init{
        day = dayTemperature - kelvin
        night = nightTemperature - kelvin
    }

    fun showWeather() {
        println("Дневная температура: $day°C\nНочная температура: $night°C")
    }
}