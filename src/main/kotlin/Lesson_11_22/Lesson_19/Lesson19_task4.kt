package org.example.Lesson_11_22.Lesson_19

fun main() {
    val tank = Tank("Танк1")
    println(tank.shooting())
    tank.reload(Cartridges.RED)
    println(tank.shooting())
    tank.reload(Cartridges.BLUE)
    println(tank.shooting())
    tank.reload(Cartridges.GREEN)
    println(tank.shooting())
    tank.reload(null)
    println(tank.shooting())
}

class Tank(
    val name: String,
) {
    private var clip: Int? = null

    fun reload(patron: Cartridges?) {
        clip = when (patron) {
            Cartridges.RED -> 20
            Cartridges.BLUE -> 5
            Cartridges.GREEN -> 10
            else -> null
        }
    }
    fun shooting() : String {
        if (clip != null) {
            return "$name сделал выстрел $clip единиц"
        }
        return "Обойма пустая, необходимо зарядить оружие"
    }
}

enum class Cartridges {
    BLUE,
    RED,
    GREEN,
}