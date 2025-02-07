import kotlin.random.Random

fun main() {
    val winNumbers = List(3) {Random.nextInt(0, 42)}
    val listNumber = mutableListOf<Int>()
    for (i in 1..3) {
        println("Введите $i-е число от 0 до 42:")
        val num = readln().toInt() ?: 0
        listNumber.add(num)
    }
    val winCombination = winNumbers.intersect(listNumber)
    val informatin = when (winCombination.size) {
        1 -> "Вы угадали 1 число и получаете утешительный приз"
        2 -> "Вы угадали 2 числа и получаете крупный приз"
        3 -> "Вы выиграли все числа и получаете Джекпот"
        else -> {"Вы не угадали ни одного числа"}
    }
    println(informatin)
    println("Выигрышная комбинация:")
    for (number in winNumbers) {
        print("$number ")
    }
}