package org.example.Lesson_11_22

class Weather() {
        var dayTemperature: Double = 25.3
        var nightTemperature: Double = 15.1
        var precipitation: Boolean = false

    fun showWeather(){
        println("Дневная температура: $dayTemperature\nНочная температура: $nightTemperature\nОсадки: $precipitation")
    }

}