package org.example.Lesson_14

open class Liner(
    val name: String,
    val speed: Int = 40,
    val capacity: Int = 150,
)

class Cargo(
    name: String,
    speed: Int,
    val cargo: Int
) : Liner(name, speed = 15, capacity = 500)

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int
) : Liner(name, speed = 20, capacity = 100) {
    fun breakIce(){
        println("Корабль $name ломает лед")
    }
}