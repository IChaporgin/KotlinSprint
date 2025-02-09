package org.example.Lesson_11_22.Lesson_11

fun main() {
    val user1 = User(
        id = 1,
        login = "Bob",
        password = "12345",
        email = "bob@bob.com"
    )

    val user2 = User(
        id = 2,
        login = "Jhon",
        password = "qwert",
        email = "jhon@jhon.com"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}

class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
){}