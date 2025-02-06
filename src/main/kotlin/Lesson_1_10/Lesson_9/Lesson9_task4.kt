package org.example.Lesson_1_10.Lesson_9

fun main() {
    println("Напиши пять ингредиентов через запятую:")
    val inputProducts = readln().split(", ")
    val sortProducts = inputProducts.sorted()
    println("Список продуктов:")
    sortProducts.forEach { println(it) }
}