package org.example.Lesson_4

/*
Задача 5* к Уроку 4

Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 (включительно) до 70 человек (включительно);
- на борту есть более 50 ящиков провизии (не включительно);
- погода благоприятна или неблагоприятна.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:

- на борту рекомендованный состав экипажа 70 человек;
- погода благоприятная;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
Программа должна анализировать эти данные и выводить результат в консоль. Для анализа должно использоваться
единое составное условие, состоящие только из логических операторов.
 */

fun main() {
    val hasDamage = true
    val isWhetherGood = true
    val crewCount = 70
    val supplyBoxes = 50

    println("Разрешение на отправку в плавание: ${(hasDamage != DAMAGE && crewCount
            >= MIN_CREW_COUNT
            && crewCount <= MAX_CREW_COUNT && supplyBoxes > MIN_SUPPLY_BOXES)
            || (crewCount == MAX_CREW_COUNT && isWhetherGood == WHETHER
            && supplyBoxes >= MIN_SUPPLY_BOXES)}")

}
const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_SUPPLY_BOXES = 50
const val DAMAGE = true
const val WHETHER = true
/* Добавил константу повреждение, на самом деле есть всегда сомнения
 добавлять константу при наличии такого же условия в теле main, это касается константы
 с погодой
 */