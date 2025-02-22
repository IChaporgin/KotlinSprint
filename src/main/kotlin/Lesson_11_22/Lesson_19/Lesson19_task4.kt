package org.example.Lesson_11_22.Lesson_19

fun main() {
    val tank = Tank("Танк1")
    println(tank.shooting())
    tank.reload(Tank.Cartridges.RED)
    println(tank.shooting())
    tank.reload(Tank.Cartridges.BLUE)
    println(tank.shooting())
    tank.reload(Tank.Cartridges.GREEN)
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
            Cartridges.RED -> Cartridges.RED.damage
            Cartridges.BLUE -> Cartridges.BLUE.damage
            Cartridges.GREEN -> Cartridges.BLUE.damage
            else -> null
        }
    }
    fun shooting() : String {
        if (clip != null) {
            return "$name сделал выстрел $clip единиц"
        }
        return "Обойма пустая, необходимо зарядить оружие"
    }

    enum class Cartridges(val damage: Int) {
        BLUE(5),
        RED(20),
        GREEN(10),
    }
}
