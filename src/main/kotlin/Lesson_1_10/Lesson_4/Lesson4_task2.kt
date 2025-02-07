/*
При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу,
которая проверяет, соответствует ли груз категории "Average". Эта категория имеет следующие параметры:
вес от 35 кг (не включительно) до 100 кг (включительно), и объем меньше 100 литров (не включительно).

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует
категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */
fun main() {
    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории" +
            " \"AVERAGE\": ${(weightCargo1 > MIN_WEIGHT && weightCargo1 <= MAX_WEIGHT) && 
                    volumeCargo1  <= MAX_VOLUME}")
    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории " +
            "\"AVERAGE\": ${(weightCargo2 > MIN_WEIGHT && weightCargo2 <= MAX_WEIGHT) && 
                    volumeCargo2  <= MAX_VOLUME}")

}
const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100