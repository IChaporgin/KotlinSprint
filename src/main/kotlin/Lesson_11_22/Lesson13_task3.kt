package org.example.Lesson_11_22

fun main() {

    val contacts = listOf(
        NewIphoneBook("Bob", 123456789, "null"),
        NewIphoneBook("Victoria", 222222222),
        NewIphoneBook("Margo", 23452345245),
        NewIphoneBook("Helga", 21392390123, "asd"),
        NewIphoneBook("Alice", 9182093810293, "qwert")
    )

    contacts.filter { it.company != null }
        .forEach { println(it.company) }
}

class NewIphoneBook(
    val name: String,
    val number: Long,
    val company: String? = null
){
    fun showInfo(){
        println("Имя: $name\nНомер: $number\nКомпания: ${company ?: "<не указано>"}")
    }
}
