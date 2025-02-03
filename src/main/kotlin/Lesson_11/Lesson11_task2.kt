package org.example.Lesson_11

fun main() {
    val user = User2(
        id = 1,
        login = "Miche",
        password = "123",
        email = "asd@sad.com",
    )
    user.printInformation()
    user.updateBio()
    println(user.bio)
    user.replacePassword()
    println()
    user.printInformation()
}