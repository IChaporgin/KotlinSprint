package org.example.Lesson_11_22.Lesson_14

import kotlin.math.PI

fun main() {
    val figures = listOf(
        Circle("черный", 15),
        Circle("белый", 7),
        Rectangle("черный", 10,5),
        Rectangle("белый", 12,2)
    )

    println( figures.filter { it.color == "белый" }
        .sumOf { it.getSquare() }
    )

    println( figures.filter { it.color == "черный" }
        .sumOf { it.getPerimeter() }
    )
}

abstract class Figure(
    val color: String
) {
    abstract fun getPerimeter() : Double
    abstract fun getSquare() : Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color){
    override fun getPerimeter() : Double {
        return 2 * PI * radius
    }

    override fun getSquare() : Double {
        return PI * (radius * radius)
    }
}

class Rectangle(
    color: String,
    val length: Int,
    val width: Int
) : Figure(color) {
    override fun getPerimeter() : Double {
        return 2 * (width.toDouble() + length.toDouble())
    }

    override fun getSquare() : Double {
        return width.toDouble() * length.toDouble()
    }
}