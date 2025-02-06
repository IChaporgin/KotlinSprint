package org.example.Lesson_1_10.Lesson_8

fun main() {
    println("Введите количество ингредиентов, которые вы хотите добавить:")
//    val count = readln().toInt()
    val ingredients = Array<String>(readln().toInt()) { readln() }

    println("Ваши ингредиенты: ${ingredients.joinToString(", ")}")
}