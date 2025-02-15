package org.example.Lesson_11_22.Lesson_17

fun main() {
    val ship = Ship("Calisto", 20, "Maiorica")
    ship.name = "Barbara"
    println(ship.name)
}

class Ship(
    name: String,
    val speed: Int,
    val port: String,
) {
    var name: String = name
        get() = field
        set(value) {
            if (value != name){
                println("Название корабля изменять нельзя!")
            }
        }
}