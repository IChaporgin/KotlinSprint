package org.example.Lesson_11_22

fun main() {

    val user = User2(
        id = 2,
        login = "Bob",
        password = "123",
        email = "bob@bob.com",
    )

    user.getInformation()
    user.getBio()
    user.changePassword()
    user.getInformation()
}