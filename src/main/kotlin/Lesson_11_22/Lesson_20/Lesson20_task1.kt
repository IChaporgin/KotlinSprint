package org.example.Lesson_11_22.Lesson_20

fun main() {
    val greeting: (String) -> String = { user -> "С Новым Годом $user!"}
    println(greeting("Игорь"))
}