package org.example.Lesson_10

fun main() {

    println("Предлагаю сыграть в игру кости!")
    var win = 0
    do {
        win += game(getNumber(), getNumber())
        Thread.sleep(1000)
        println("Вы хотите продолжить?")
        val answer = readln()
    } while (answer.lowercase() == "да")

    println("Количество ваших побед: $win")
}

fun getNumber() : Int {
    val range = 1..6
    return range.random()
}

fun game(player: Int, computer: Int) : Int {
    var win = 0
    println("У вас выпало: $player")
    Thread.sleep(1000)
    println("У машины выпало: $computer")
    Thread.sleep(1000)

    if (player > computer) {
        println("Победило человечество")
        win++
    } else if (computer > player) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
    return win
}