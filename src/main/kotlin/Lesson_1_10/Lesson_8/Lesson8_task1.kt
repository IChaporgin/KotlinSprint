package org.example.Lesson_1_10.Lesson_8

fun main() {
    val views: Array<Int> = arrayOf(200, 720,54,88, 114, 97)
    var sumViews = 0

    for (i in views) {
        sumViews += i
    }

    println("Всего просмотров рекламы: $sumViews")
}
