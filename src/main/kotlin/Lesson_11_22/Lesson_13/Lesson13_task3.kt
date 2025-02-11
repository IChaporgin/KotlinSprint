package org.example.Lesson_11_22.Lesson_13

fun main() {
    val contacts = listOf(
        ContactsBook("Eva", 1234567, "null"),
        ContactsBook("Liza", 7654321, "GPT"),
        ContactsBook("Bob", 5555555, "Google"),
        ContactsBook("Li", 123456432),
        ContactsBook("Alice", 6656565656)
    )

    contacts.filter { it.company != null }
        .forEach { println(it.company) }
}

class ContactsBook(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun showInfo() {
        println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "<не указано>"}")
    }
}