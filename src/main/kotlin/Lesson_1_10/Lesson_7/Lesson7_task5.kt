package org.example.Lesson_1_10.Lesson_7

fun main() {

    val allSymbols = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    var number: Int
    val generatePassword: MutableList<Char> = mutableListOf('!', '@', '%')
    do {
        println("Введите длину пароля, минимум 6 символов:")
        number = readln().toInt()
    } while (number < 6)

    for (i in 4..number) {
        generatePassword += allSymbols.random()
    }

    generatePassword.shuffle()

    val password: String = generatePassword.joinToString("")
    println("Ваш пароль: $password")
}
