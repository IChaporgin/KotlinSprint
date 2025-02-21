package org.example.Lesson_11_22.Lesson_21

fun main() {
    val message = "hello"
    println(message.vowelCount())
}

fun String.vowelCount() : Int {
    val vowel = listOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y')
    return count { it in vowel }
}