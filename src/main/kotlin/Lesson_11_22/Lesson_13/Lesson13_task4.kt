package org.example.Lesson_11_22.Lesson_13

fun main() {
    val contactsList = mutableListOf<ContactsBookAdd>()
    addContact(contactsList)
    contactsList.forEach { it.showInfo() }
}

fun addContact(contact: MutableList<ContactsBookAdd>) {
    do {
        println("Вы хотите добавить новый контакт?")
        val answer = readln()
        if (answer.lowercase() != "да"){
            break
        }
        println("Введите имя:")
        val name = readln()
        println("Введите номер телефона")
        val number = readln().toLongOrNull()
        if (number == null) {
            println("Не корректный номер телефона")
            continue
        }
        println("Введите компанию:")
        val company = readln()
        contact.add(ContactsBookAdd(name, number, company))
        println("Контакт добавлен!")
    } while (true)
}

class ContactsBookAdd(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun showInfo() {
        println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "<не указано>"}")
    }
}