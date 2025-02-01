package org.example.Lesson_10

fun main() {

    println("Введите длину пароля:")
    val count = readln().toInt()
    println("Ваш пароль: ${generatePassword(count)}")

}

fun generatePassword(number: Int) : String {
    val range = '0'..'9'
    val symbols = "!\"#$%&'()*+,-./ "
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