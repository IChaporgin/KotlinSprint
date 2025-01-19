/*
На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений.
Напиши программу, которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:

- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых?
true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:

- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.
 */

fun main() {
    val isSunny = true
    val isOpenAwning = true
    val humidity = 20
    val whether = "Warm"
    val result = isSunny == REQUIRED_WEATHER
            && isOpenAwning == TENT_OPEN
            && (humidity == REQUIRED_HUMIDITY)
            && whether != UNFAVORABLE_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}

const val REQUIRED_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "Whinter"  // возможно не очень хорошая практика создавать две локально и глобально с одним неймингом
const val REQUIRED_WEATHER = true
const val TENT_OPEN = true
