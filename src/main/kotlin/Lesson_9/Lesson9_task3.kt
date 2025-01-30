package org.example.Lesson_9

fun main() {
    val countProducts = listOf(2, 50, 15)
    println("Какое количество порций вы хотите приготовить?")
    val count = readln().toInt()
    println("На $count порций вам понадобится: Яиц – ${countProducts[0] * count}, молока – ${countProducts[1] * count}" +
            ", сливочного масла – ${countProducts[2] * count}")
}