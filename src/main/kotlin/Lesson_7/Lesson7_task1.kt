package org.example.Lesson_7

fun main() {
    val range1 = 1..9
    val range2 = 'a'..'z'
    var password = ""

    for (i in 1..3) {
        password += range2.random() + range1.random().toString()
    }
    println("Ваш пароль: $password")
}