package org.example.Lesson_12

fun main() {
    val weather1 = NewWeather(300, 280)
    weather1.showWeather()

}

class NewWeather(dayTemperature: Int, nightTemperature: Int,) {
    private val kelvin = 273
    val day = dayTemperature - kelvin
    val night = nightTemperature - kelvin


    fun showWeather() {
        println("Дневная температура: $day°C\nНочная температура: $night°C")
    }
}