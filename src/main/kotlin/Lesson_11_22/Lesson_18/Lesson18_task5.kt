package org.example.Lesson_11_22.Lesson_18

fun main() {
    val screen = Screen()
    println(screen.drawCircle(10, 20))
    println(screen.drawBox(10.1f, 5.4f))
}

class Screen(){
    fun drawPoint(x: Int, y: Int) : String {
        return "На экране фигура Точка с координатами: x: $x и y: $y"
    }
    fun drawPoint(x: Float, y: Float) : String {
        return "На экране фигура Точка с координатами: x: $x и y: $y"
    }
    fun drawCircle(x: Float, y: Float) : String {
        return "На экране фигура Круг с координатами: x: $x и y: $y"
    }
    fun drawCircle(x: Int, y: Int) : String {
        return "На экране фигура Круг с координатами: x: $x и y: $y"
    }
    fun drawBox(x: Float, y: Float) : String {
        return "На экране фигура Квадрат с координатами: x: $x и y: $y"
    }
    fun drawBox(x: Int, y: Int) : String {
        return "На экране фигура Квадрат с координатами: x: $x и y: $y"
    }
}
