package org.example.Lesson_1_10.Lesson_7

fun main() {
    println("Введите количество секунд для отчета:")
    val time: Int = readln().toInt()
    for (i in time downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}