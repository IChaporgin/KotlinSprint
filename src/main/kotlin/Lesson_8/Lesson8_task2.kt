package org.example.Lesson_8

fun main() {
    val ingredientApplePie = arrayOf("яйца", "сметана", "мука", "сахар", "яблоки")
    var result = false
    println("Какой ингредиент вы хотите найти?")
    val ingredient = readln()
    for (i in ingredientApplePie) {
        if (i == ingredient) {
            result = true
            break
        }
    }

    if (result){
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }



}