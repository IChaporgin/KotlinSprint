package org.example.Lesson_7

fun main() {
   while (true) {
       val range = 1000..9999
       val sms = range.random()
       println("Ваш код авторизации: $sms")
       while (true) {
           println("Введите проверочный код:")
           val check = readln().toInt()
           if (check == sms) {
               println("Код корректен")
               return
           } else {
               println("Не правильный код")
           }
       }
   }
}