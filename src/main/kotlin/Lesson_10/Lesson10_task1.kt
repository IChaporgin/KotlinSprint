package org.example.Lesson_10

fun main() {
    println("Предлагаю сыграть в игру кости!")
    do {
        val progressPlayer = getNumber()
        println("У вас выпало: $progressPlayer")
        Thread.sleep(1000)
        val progressComputer = getNumber()
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
    } while (answer == "да")
}

fun getNumber() : Int {
    val range = 1..6
    return range.random()
}