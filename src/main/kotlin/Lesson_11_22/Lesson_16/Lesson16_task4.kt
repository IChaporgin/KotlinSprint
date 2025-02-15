package org.example.Lesson_11_22.Lesson_16

fun main() {
    val order = Order(11111)
    order.showInfo()
    order.setStatus(Status1.CANCELED)
    order.showInfo()
}

class Order(
    private val number: Int,
    private var status: Status1 = Status1.PROCESSING,
) {
    fun setStatus(status: Status1) {
        changeStatus(status)
    }

    fun showInfo(){
        println("Заказ: $number, статус: $status")
    }

    private fun changeStatus(status: Status1){
        this.status = status
    }
}

enum class Status1 {
    PENDING,
    PROCESSING,
    COMPLETED,
    CANCELED
}