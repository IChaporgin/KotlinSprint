package org.example.Lesson_9

fun main() {
    val ingredientsList = mutableListOf("яблоко", "мука", "сахар")
    println("В рецепте есть базовые ингредиенты:")
    ingredientsList.forEach{ println(it) }
    println("Желаете добавить еще?")
    val answer = readln()
    if (answer.lowercase() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val ingredient = readln()
        ingredientsList.add(ingredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${ingredientsList.joinToString(", ") }")
    } else {
        return
    }
}
