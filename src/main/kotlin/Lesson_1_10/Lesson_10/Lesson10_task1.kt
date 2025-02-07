package org.example.Lesson_1_10.Lesson_10

fun main() {
    println("Предлагаю сыграть в игру кости!")
    do {
        val progressPlayer = getNumber1()
        println("У вас выпало: $progressPlayer")
        Thread.sleep(1000)
        val progressComputer = getNumber1()
        println("У машины выпало: $progressComputer")
        Thread.sleep(1000)

        if (progressPlayer > progressComputer) {
            println("Победило человечество")
        } else if (progressComputer > progressPlayer) {
            println("Победила машина")
        } else {
            println("Победила дружба")
        }
        Thread.sleep(1000)
        println("Вы хотите продолжить?")
        val answer = readln()
    } while (answer.lowercase() == "да")
}

fun getNumber1() : Int {
    val range = 1..6
    return range.random()
}