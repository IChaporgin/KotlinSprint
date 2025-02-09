package org.example.Lesson_12

fun main() {
    val weather = WeatherCelsius(
        86,
        54,
        true
    )
    weather.showWeather()
}

class WeatherCelsius(val dayTemperature: Int, val nightTemperature: Int, val precipitation: Boolean) {

    val dayTemperatureCelsius: Int
    val nightTemperatureCelsius: Int
    private val kelvin = 273

    init {
        dayTemperatureCelsius = dayTemperature - kelvin
        nightTemperatureCelsius = nightTemperature - kelvin
    }

    fun showWeather() {
        println("Дневная температура: $dayTemperatureCelsius°C\nНочная температура: $nightTemperatureCelsius°C\nОсадки: $precipitation")
    }
}