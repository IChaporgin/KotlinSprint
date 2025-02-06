package org.example.Lesson_1_10.Lesson_8

fun main() {
    val ingredientApplePie = arrayOf("яйца", "сметана", "мука", "сахар", "яблоки")
    println("Какой ингредиент вы хотите найти?")
    val ingredient = readln()

    if (ingredient in ingredientApplePie) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
