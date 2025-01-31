package org.example.Lesson_10

fun main() {
    do {
        println("Введите ваше имя:")
        val name = readln()
        println("Введите ваш пароль:")
        val password = readln()
        if (checkCountSymbols(name) && checkCountSymbols(password)) {
            println("Добро пожаловать в систему")
            return
        } else {
            println("Логин или пароль недостаточно длинные")
        }
    } while (true)
}

fun checkCountSymbols(data: String) : Boolean {
    val check = data.length > 3
    return check
}