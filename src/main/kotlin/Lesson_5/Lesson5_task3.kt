/*
Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42. Если угадать
только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.
Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми подсказками о том, что нужно вводить. Вывести отдельным сообщением,
какие числа были нужны для победы.

- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
- если не угадано ничего, вывести “Неудача!”;
- программа должна учитывать ввод чисел в обратном порядке.
 */

fun main() {
    println("Введите первое число от 0 до 42:")  //в моем решении нет проверки на диапазон, не понял нужно ли его делать
    val num1 = readLine()?.toIntOrNull() ?: 0
    println("Введите второе число от 0 до 42:")
    val num2 = readLine()?.toIntOrNull() ?: 0

    if (num1 == NUM_WIN1 && num2 == NUM_WIN2 || num2 == NUM_WIN1 && num1 == NUM_WIN2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (num1 == NUM_WIN1 || num2 == NUM_WIN2 || num2 == NUM_WIN1 || num1 == NUM_WIN2) {
        println("Вы выиграли утешительный приз!")
        println("Победные числа $NUM_WIN1 и $NUM_WIN2")
    } else {
        println("Неудача!")
        println("Победные числа $NUM_WIN1 и $NUM_WIN2")
    }
}

const val NUM_WIN1 = 15
const val NUM_WIN2 = 40