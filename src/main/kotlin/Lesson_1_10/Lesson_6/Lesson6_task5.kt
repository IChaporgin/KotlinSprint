package org.example.Lesson_1_10.Lesson_6

import kotlin.random.Random

fun main() {
    println("Введите ваш логин для регистрации:")
    val login: String = readln()
    println("Введите пароль:")
    val password: String = readln()

    while (true) {
        println("Введите логин для входа в систему:")
        val checkLog: String = readln()
        println("Введите пароль для входа в систему:")
        val checkPas: String = readln()

        if (checkLog == login && checkPas == password) {   //Проверка на корректность логина и пароля
                println("Реши 3 простые математические задачки)")
                var count = 3

                while (count > 0) {
                    val num1: Int = Random.nextInt(1,10)
                    val num2: Int = Random.nextInt(1,10)
                    println("$num1 + $num2 = ")
                    val result: Int = readln().toInt()
                    if (result == num1 + num2) {
                        --count
                    } else {
                        println("Надо повторить математику или вы Бот))")
                        return
                    }
                }
            break
        } else {
            println("Ошибка логина или пароля!")
        }
    }
    println("Авторизация прошла успешно")
}