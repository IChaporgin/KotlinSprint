package org.example.Lesson_11_22.Lesson_16

fun main() {
    val round = Round(10)
    println(round.area())
    println(round.perimeter())
}

class Round(
    var radius: Int,
    private var pi: Double = 3.14,
) {
    fun area() : Double {
        return pi * radius.toDouble() * radius.toDouble()
    }
    fun perimeter() : Double {
        return 2 * pi * radius.toDouble()
    }
}
