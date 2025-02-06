package org.example.Lesson_1_10.Lesson_7

fun main() {
    println("Введите число:")
    val number: Int = readln().toInt()

    for (i in 0..number step 2){
        println(i)
    }
}