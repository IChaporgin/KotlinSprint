package org.example.Lesson_11_22.Lesson_20

fun main() {
    val listElements = listOf("Круг", "Квадрат", "Треугольник", "Овал")
    val elements = listElements.map { element -> { println("Нажат: $element") }}
    elements.forEachIndexed { index, value ->
        if (index % 2 == 1) {
            value()
        }
    }
}