package org.example.Lesson_9

fun main() {
    println("Напиши пять ингредиентов через запятую:")
    val inputProducts = readln().split(", ")
//    val productsList: MutableList<String> = mutableListOf()
//    productsList.addAll(inputProducts)
    val sortProducts = inputProducts.sorted()
    println("Список продуктов:")
    sortProducts.forEach { println(it) }
}