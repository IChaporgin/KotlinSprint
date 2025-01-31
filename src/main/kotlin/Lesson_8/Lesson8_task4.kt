package org.example.Lesson_8

fun main() {
    val ingredients = arrayOf("молоко", "кефир", "сахар", "яблоки", "соль", "мука")

    for (i in ingredients){
        println("${ingredients.indexOf(i) + 1}. Ингредиент: $i")
    }
    println("Какой ингредиент вы хотите заменить?")
    val product = readln()

    if (product !in ingredients){
        println("Такого ингредиента нет!")
        return
    } else {
        println("Какой ингредиент добавить?")
        val addIngredient = readln()
        ingredients[ingredients.indexOf(product)] = addIngredient
    }
    println("Готово! Вы сохранили следующий список:")
    for (i in ingredients) {
        println("${ingredients.indexOf(i) + 1}. Ингредиент: $i")
    }
}