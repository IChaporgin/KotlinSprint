package org.example.Lesson_11_22

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

    init {
        dayTemperatureCelsius = dayTemperature - 273
        nightTemperatureCelsius = nightTemperature - 273
    }

    fun showWeather() {
        println("Дневная температура: $dayTemperatureCelsius°C\nНочная температура: $nightTemperatureCelsius°C\nОсадки: $precipitation")
    }
}