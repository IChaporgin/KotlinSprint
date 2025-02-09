package org.example.Lesson_1_10.Lesson_10

fun main() {

    println("Введите длину пароля:")
    val count = readln().toInt()
    val password = generatePassword(count)
    println("Ваш пароль: $password")

}

fun generatePassword(number: Int) : String {
    val range = '0'..'9'
    val symbols = (MIN_SYMBOL_DEC..MAX_SYMBOL_DEC).map { it.toChar() }
    println(MIN_SYMBOL_DEC.toChar())
    var password = ""
    for (i in 1..number) {
        if (i % 2 != 0) {
            password += range.random()
        } else {
            password += symbols.random()
        }
    }
    return password
}
const val MIN_SYMBOL_DEC = 32
const val MAX_SYMBOL_DEC = 47