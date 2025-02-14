package org.example.Lesson_11_22.Lesson_15

fun main() {
    val temperature = Temperature(20)
    val precipitation = PrecipitationAmount(5)
    val server = WeatherServer()
    println(server.sendData(temperature))
    println(server.sendData(precipitation))
}

abstract class WeatherStationStats {
    abstract fun getData() : String
}

class Temperature(
    val temperature: Int,
) : WeatherStationStats() {
    override fun getData() : String {
        return "Температура $temperature"
    }
}

class PrecipitationAmount(
    val precipitationCount: Int,
) : WeatherStationStats() {
    override fun getData() : String {
        return "Количество осадков $precipitationCount"
    }
}

class WeatherServer {
    fun sendData(data: WeatherStationStats) : String {
        return data.getData()
    }
}