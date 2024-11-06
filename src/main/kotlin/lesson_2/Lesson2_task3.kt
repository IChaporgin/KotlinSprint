/*Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и
будет в пути 457 минут.

– Создай целочисленные переменные и проинициализируй их этими данными;
– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
– Выведи результат в консоль.
 */

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val minuteToGo = 457
    val totalMinutes = minuteOfDeparture + minuteToGo
    val minuteArrival = totalMinutes % 60
    val hourArrival = (totalMinutes / 60) + hourOfDeparture

    println("Time to Arrival: ${"%02d".format(hourArrival)}:${"%02d".format(minuteArrival)}")
}