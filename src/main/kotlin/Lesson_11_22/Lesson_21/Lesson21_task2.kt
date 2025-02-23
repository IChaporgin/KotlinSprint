package org.example.Lesson_11_22.Lesson_21

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() : Int {
    return this.filter { it % 2 == 0 }.sum()
}