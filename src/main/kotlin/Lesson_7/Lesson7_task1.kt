package org.example.Lesson_7

fun main() {
    val range1 = 1..9
    val range2 = 'a'..'z'

    for (i in 1..3) {
        print("${range2.random()}${range1.random()}")
    }
}