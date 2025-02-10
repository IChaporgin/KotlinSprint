package org.example.Lesson_11_22.Lesson_12

fun main() {
    val weather1 = WeatherInit(300, 280)

}

class WeatherInit(dayTemperature: Int, nightTemperature: Int) {
    private val kelvin = 273
    val day = dayTemperature - kelvin
    val night = nightTemperature - kelvin

    init {
        showWeather()
    }

    fun showWeather() {
        println("Дневная температура: $day°C\nНочная температура: $night°C")
    }
}