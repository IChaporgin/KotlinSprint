package org.example.Lesson_11_22.Lesson_16

fun main() {
    val cube = Cube()
    cube.showNumber()
}

class Cube(
    private val range: IntRange = 1..6,
    private val number: Int =  range.random(),
) {
    fun showNumber(){
        println("Выпало: $number")
    }
}