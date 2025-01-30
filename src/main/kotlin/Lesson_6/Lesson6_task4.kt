package org.example.Lesson_6

import kotlin.random.Random

fun main() {
    println("Поиграем в небольшую игру. Тебе надо угадать число от 1 до 9. У тебя 5 попыток. Давай начнем")
    var attempts = 5
    val num: Int = Random.nextInt(1, 10)

     while (attempts > 0){
         println("Введите число:")
         val check: Int = readln().toInt()
         if (check == num) {
             println("Это была великолепная игра!")
             return
         } else {
             attempts--
             println("Загадано другое число, у тебя осталось $attempts попыток")
         }
     }
    println("Было загадано число $num")
}