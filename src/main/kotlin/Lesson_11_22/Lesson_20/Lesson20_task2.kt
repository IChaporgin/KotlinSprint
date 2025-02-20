package org.example.Lesson_11_22.Lesson_20

fun main() {
    val userGame = UserGame(10, 100)
    val treatment: (UserGame) -> Unit = {userGame.health = userGame.maxHealth}
    println(userGame.health)
    treatment(userGame)
    println(userGame.health)
}

class UserGame(
    var health: Int,
    val maxHealth: Int,
)