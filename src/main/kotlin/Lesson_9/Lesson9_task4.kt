package org.example.Lesson_9

fun main() {
    println("Напиши пять ингредиентов через запятую:")
    val inputProducts = readln().split(", ")
    val productsList: MutableList<String> = mutableListOf()
    productsList.addAll(inputProducts)
    productsList.sort()
    println("Список продуктов:")
    productsList.forEach { println(it) }
}