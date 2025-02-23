package org.example.Lesson_11_22.Lesson_21

fun main() {
    val player = NewUserGame(20, 100)
    println(player.isHealthy())
    player.health = 100
    println(player.isHealthy())
}

class NewUserGame(
    var health: Int,
    val maxHealth: Int,
)

fun NewUserGame.isHealthy() : Boolean {
    return health == maxHealth
}