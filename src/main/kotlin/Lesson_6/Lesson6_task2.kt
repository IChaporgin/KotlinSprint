package org.example.Lesson_6

fun main() {

    println("Введите кол-во секунд которые нужно засечь:")
    val time: Int = readln().toInt()
    Thread.sleep(time.toLong() * 1000)
    println("Прошло $time секунд")
}