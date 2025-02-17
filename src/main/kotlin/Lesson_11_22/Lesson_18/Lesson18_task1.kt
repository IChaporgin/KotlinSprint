package org.example.Lesson_11_22.Lesson_18

fun main() {
    val order = Order(111)
    order.showOrder("Морковь")
    order.showOrder(listOf("морковь", "свекла"))
}

class Order(
    val number: Int,
) {
    fun showOrder(product: String) {
        println("Заказ: $number. Заказан товар: $product")
    }

    fun showOrder(products: List<String>) {
        println("Заказ: $number. Заказан товар: $products")
    }
}