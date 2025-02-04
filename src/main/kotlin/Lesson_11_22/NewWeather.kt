package org.example.Lesson_11_22

class NewWeather(_dayTemperature: Double, _nightTemperature: Double, _precipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var precipitation = _precipitation

    fun showWeather(){
        println("Дневная температура: $dayTemperature\nНочная температура: $nightTemperature\nОсадки: $precipitation")
    }
}