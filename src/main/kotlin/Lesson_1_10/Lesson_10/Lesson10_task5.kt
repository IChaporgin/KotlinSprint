package org.example.Lesson_1_10.Lesson_10

fun main() {
    println("Введите логин и пароль:")
    getBasket(checkAuthorization(readln(), readln()))

   }

const val PASSWORD = "qwert"
const val LOGIN = "admin"
const val LENGTH_TOKEN = 32

fun checkAuthorization(log: String, pas: String) : String? {
    val answer = (log == LOGIN && pas == PASSWORD)
    val chars: Array<IntRange> = arrayOf(48..57, 65..90, 97..122)
    return if (answer) {
        (1..LENGTH_TOKEN)
        .map { chars.random().random().toChar() }
        .joinToString("")}
    else null
}

fun getBasket(token: String?){
    if (token != null) {
        val basket = listOf("Картофель", "Яблоки", "Молоко", "Сахар")
        basket.forEach{ println(it) }
    } else {
        println("Неудачная авторизация")
    }
}

