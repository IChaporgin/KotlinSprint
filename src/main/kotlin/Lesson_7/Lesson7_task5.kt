package org.example.Lesson_7

fun main() {

    val capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowLetters = "abcdefghijklmnopqrstuvwxyz"
    val numbers = "0123456789"
    val symbols = "@$!"
    var number: Int

    do {
        println("Введите длину пароля, минимум 6 символов:")
        number = readln().toInt()
    } while (number < 6)

    var password = ""

    for (i in 0..number) {
        when (i % 4) {
            0 -> password += capitalLetters.random()
            1 -> password += lowLetters.random()
            2 -> password += numbers.random()
            3 -> password += symbols.random()
        }
    }
    println("Ваш пароль: ${password}")
}
