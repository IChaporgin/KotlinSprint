package org.example.Lesson_11_22.Lesson_14

open class Liner(
    val name: String,
    val speed: Int = 40,
    val capacity: Int = 150,
)

class Cargo(
    name: String,
    speed: Int = 15,
    capacity: Int = 500,
) : Liner(name, speed, capacity)

class Icebreaker(
    name: String,
    speed: Int = 20,
    capacity: Int = 100,
) : Liner(name, speed, capacity ) {
    fun breakIce(){
        println("Корабль $name ломает лед")
    }
}