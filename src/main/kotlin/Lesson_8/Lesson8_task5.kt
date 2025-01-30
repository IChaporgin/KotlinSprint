package org.example.Lesson_8

fun main() {
    println("Введите количество ингредиентов, которые вы хотите добавить:")
    val count = readln().toInt()
    val ingredients = Array<String>(count) {""}
    for (i in 1..count) {
        println("Введите $i ингредиент:")
        val ingredient = readln()
        ingredients[i - 1] = ingredient
    }
    println("Ваши ингредиенты: ${ingredients.joinToString(", ")}")
}