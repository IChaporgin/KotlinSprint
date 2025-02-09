package org.example.Lesson_1_10.Lesson_9

fun main() {
    val products: MutableSet<String> = mutableSetOf()
    println("Введите список продуктов:")
    while (products.count() < 5) {
        val product = readln()
        if (!products.add(product)) {
            println("Такой продукт уже есть в списке!")
        }
    }
    val sortedProducts = products.map { it.replaceFirstChar { it.uppercase() } }.sorted()
    println(sortedProducts.joinToString(", "))
}