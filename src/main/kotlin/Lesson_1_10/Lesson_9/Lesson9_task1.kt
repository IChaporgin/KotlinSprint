package org.example.Lesson_1_10.Lesson_9

fun main() {
    val ingredientsList = listOf("молоко", "кефир", "сахар", "яблоки", "соль", "мука")
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach { println(it) }
}