package org.example.Lesson_9

fun main() {
    val countProducts = listOf(2, 50, 15)
    println("Какое количество порций вы хотите приготовить?")
    val count = readln().toInt()
    val countProductsDish = countProducts.map { it * count }
    println("На $count порций вам понадобится: Яиц – ${countProductsDish[0]}, молока – ${countProductsDish[1]}" +
            ", сливочного масла – ${countProductsDish[2]}")
}