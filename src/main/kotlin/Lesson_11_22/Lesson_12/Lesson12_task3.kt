package org.example.Lesson_11_22.Lesson_12

fun main() {
    val weather = NewWeatherKelvin(300, 280)
    weather.showWeather()

}

class NewWeatherKelvin(dayTemperature: Int, nightTemperature: Int,) {
    private val kelvin = 273
    val day = dayTemperature - kelvin
    val night = nightTemperature - kelvin


    fun showWeather() {
        println("Дневная температура: $day°C\nНочная температура: $night°C")
    }
}