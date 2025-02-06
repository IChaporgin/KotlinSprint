package org.example.Lesson_1_10.Lesson_8

fun main() {
    val ingredients = arrayOf("молоко", "кефир", "сахар", "яблоки", "соль", "мука")

    for ((i, v) in ingredients.withIndex()){
        println("${i + 1}. Ингредиент: $v")
    }
    println("Какой ингредиент вы хотите заменить?")

    val index = ingredients.indexOf(readln())

    if (index == -1) {
        println("Такого ингредиента нет!")
        return
    }

    println("Какой ингредиент добавить?")
    val addIngredient = readln()
    ingredients[index] = addIngredient

    println("Готово! Вы сохранили следующий список:")

    for ((i, v) in ingredients.withIndex()) {
        println("${i + 1}. Ингредиент: $v")
    }
}