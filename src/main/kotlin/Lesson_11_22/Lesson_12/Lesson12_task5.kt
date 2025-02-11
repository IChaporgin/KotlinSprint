package org.example.Lesson_11_22.Lesson_12

fun main() {
    val rangeTemperature = MIN_TEMPERATURE..MAX_TEMPERATURE
    val precipitationArray = arrayOf(true, false)
    val weatherList: MutableList<WeatherAdvanced> = mutableListOf()
    for (i in 1..30){
        weatherList.add(WeatherAdvanced(
            rangeTemperature.random(),
            rangeTemperature.random(),
            precipitationArray.random()
        ))
    }

    val averageDayTemperature = weatherList.map { it.day }
        .average()
    val averageNightTemperature = weatherList.map { it.night }
        .average()
    val countSunshinyDay = weatherList.count { it.precipitation == false }

    println("""
        Средняя дневная температура: ${String.format("%.2f", averageDayTemperature)}
        Ночная: ${String.format("%.2f", averageNightTemperature)}
        Дней без осадков: $countSunshinyDay
    """.trimIndent())
}

class WeatherAdvanced(dayTemperature: Int, nightTemperature: Int, val precipitation: Boolean = false) {
    private val kelvin = 273
    val day = dayTemperature - kelvin
    val night = nightTemperature - kelvin

    init {
        showWeather()
    }

    fun showWeather() {
        println("Дневная температура: $day°C\nНочная температура: $night°C,\nОсадки: $precipitation")
    }
}
const val MIN_TEMPERATURE = 273
const val MAX_TEMPERATURE = 308