package org.example.Lesson_11_22.Lesson_19

fun main() {
    val ship = StarShip("Сокол тысячелетия")
//    ship.takeOff()
//    ship.landing()
    ship.shooting()
}

class StarShip(
    val name: String
) {
    fun takeOff(){
        TODO()
    }
    fun landing() {
        TODO("нужна информация о дополнительной логике.")
    }
    fun shooting(){
        println("Корабль $name отстреливается от астероидов")
    }

}