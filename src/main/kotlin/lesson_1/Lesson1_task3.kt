package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hours: String = "09" // Задал переменную в типе String для вывода с 0
    var minutes: String = "07" // Задал переменную в типе String для вывода с 0

    println(year)
    println(hours)
    println(minutes)

    hours = "10"
    minutes = "55"

    print(hours)
    print(':')
    print(minutes)
}