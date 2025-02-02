package org.example.Lesson_9

fun main() {
    val ingredientsList = listOf("молоко", "кефир", "сахар", "яблоки", "соль", "мука")
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach { println(it) }
}