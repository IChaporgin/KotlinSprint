package org.example.Lesson_7

fun main() {
    val range1 = 1..9
    val range2 = 'a'..'z'
    val length = 6..9
    var password = ""

    for (i in 1..length.random()) {
        if (i % 2 == 0) {
            password += range2.random()
        } else {
            password += range1.random().toString()
        }
    }
    println("Ваш пароль: $password")
}