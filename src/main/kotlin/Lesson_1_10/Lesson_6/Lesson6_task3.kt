package org.example.Lesson_1_10.Lesson_6

fun main() {

    println("Введите кол-во секунд которые нужно засечь:")
    var time: Int = readln().toInt()
    while (time > 0) {
        println("Осталось секунд: ${time--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}