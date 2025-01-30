package org.example.Lesson_7

fun main() {

    val allSymbols = ('A'..'Z') + ('a'..'z') + ('0'..'9') + ('!'..'@')
    var number: Int
    var password = ""

    do {
        println("Введите длину пароля, минимум 6 символов:")
        number = readln().toInt()
    } while (number < 6)

    for (i in 0..number) {
        password += allSymbols.random()
    }
    println("Ваш пароль: ${password}")
}
