package org.example.Lesson_11_22

class NewWeather(var dayTemperature: Double, var nightTemperature: Double, var precipitation: Boolean) {

    fun showWeather(){
        println("Дневная температура: $dayTemperature\nНочная температура: $nightTemperature\nОсадки: $precipitation")
    }
}