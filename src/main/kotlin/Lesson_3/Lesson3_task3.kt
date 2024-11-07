/*
Задача 3 к Уроку 3

Пишем программу, которая будет помогать учить таблицу умножения.
В отдельную переменную будет записываться число (объявить и проинициализировать),
а выводиться будет таблица умножения для этого числа. Таблица должна корректно
печататься, если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается
  один раз.
 */

fun main() {
    println("Введите число: ")
    val number: Int = readLine()!!.toInt()
    println("""
        $number X 1 = ${number * 1}
        $number X 2 = ${number * 2}
        $number X 3 = ${number * 3}
        $number X 4 = ${number * 4}
        $number X 5 = ${number * 5}
        $number X 6 = ${number * 6}
        $number X 7 = ${number * 7}
        $number X 8 = ${number * 8}
        $number X 9 = ${number * 9}
    """.trimIndent())
}