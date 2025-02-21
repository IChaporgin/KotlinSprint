package org.example.Lesson_11_22.Lesson_19

fun main() {
    val listProducts = listOf(
        EcommerceProducts(1, Products.CLOTHING),
        EcommerceProducts(2, Products.CLOTHING),
        EcommerceProducts(3, Products.STATIONARY)
    )

    listProducts.forEach { println(it.showInfo()) }
    listProducts.forEach { println(it.product.getCategoryName()) }
}

class EcommerceProducts(
    val id: Int,
    val product: Products
) {
    fun showInfo() : String {
        return "Товар id: $id тип: ${product.getCategoryName()}"
    }
}

enum class Products {
    CLOTHING,
    STATIONARY,
    MISCELLANEOUS;

    fun getCategoryName() = when(this) {
        CLOTHING -> "Одежда"
        STATIONARY -> "Канцелярские товары"
        MISCELLANEOUS -> "Разное"
    }
}