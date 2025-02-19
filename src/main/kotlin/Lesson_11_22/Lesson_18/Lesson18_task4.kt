package org.example.Lesson_11_22.Lesson_18

fun main() {
    val box = CubeBox(10.0)
    println(box.getArea())
    val box2 = RectangleBox(10.0, 5.0, 7.0)
    println(box2.getArea())
}

abstract class Box() {
    abstract fun getArea() : Double
}

class CubeBox(
    val edge: Double,
) : Box() {
    override fun getArea() : Double {
        return 6 * (edge * edge)
    }
}

class RectangleBox(
    val width: Double,
    val length: Double,
    val height: Double,
) : Box() {
    override fun getArea(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}