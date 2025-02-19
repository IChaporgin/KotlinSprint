package org.example.Lesson_11_22.Lesson_20

fun main() {
    val greeting: (String) -> String = {user: String -> "С Новым Годом $user!"}
    println(greeting("Игорь"))
}