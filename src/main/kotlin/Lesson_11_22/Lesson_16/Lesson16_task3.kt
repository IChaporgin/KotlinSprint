package org.example.Lesson_11_22.Lesson_16

fun main() {
    val user = User("Bob", "qwert")
    println(user.checkPassword("qwer"))
}

class User(
    val name: String,
    private val password: String,
) {
    fun checkPassword(pass: String) : Boolean {
        return pass == password
    }
}