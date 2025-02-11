package org.example.Lesson_11_22.Lesson_14

fun main() {
    val liner1 = Liner1("Liner1")
    liner1.showInfo()
    liner1.loading()
    println()
    val cargo1 = Cargo1("Cargo1")
    cargo1.showInfo()
    cargo1.loading()
    println()
    val icebreaker1 = Icebreaker1("Icebreaker1")
    icebreaker1.showInfo()
    icebreaker1.loading()
    icebreaker1.breakIce()
}

open class Liner1(
    val name: String,
    val speed: Int = 40,
    val capacity: Int = 150,
) {
    fun showInfo(){
        println("-Корабль: $name\n-Скорость: $speed\n-Вместимость: $capacity")
    }
    open fun loading(){
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo1(
    name: String,
    speed: Int = 15,
    capacity: Int = 500,
) : Liner1(name, speed, capacity) {
    override fun loading() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker1(
    name: String,
    speed: Int = 20,
    capacity: Int = 100
) : Liner1(name, speed, capacity) {
    override fun loading() {
        println("Ледокол открывает ворота со стороны кормы.")
    }
    fun breakIce(){
        println("Корабль $name ломает лед")
    }
}