package org.example.Lesson_9

fun main() {
    val products: MutableList<String> = mutableListOf()
    println("Введите список продуктов:")
    while (products.count() < 5) {
        val product = readln()
        if (product !in products) {
            products.add(product)
            products.sort()
        } else {
            println("Такой продукт уже есть в списке!")
        }
    }
    val modifyProductsList = products.map { it.replaceFirstChar { it.uppercase() } }
    println(modifyProductsList.joinToString(", "))
}