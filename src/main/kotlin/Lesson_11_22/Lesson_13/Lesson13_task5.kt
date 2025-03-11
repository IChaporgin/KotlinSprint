package org.example.Lesson_11_22.Lesson_13


fun main() {

    val contactsListNew = mutableListOf<ContactsBookAddNew>()
    addContactNew(contactsListNew)
    contactsListNew.forEach { it.showInfo() }
}

fun addContactNew(contact: MutableList<ContactsBookAddNew>) {
    do {
        println("Вы хотите добавить новый контакт?")
        val answer = readln()
        if (answer.lowercase() != "да") {
            break
        }
        println("Введите имя:")
        val name = readln()
        println("Введите номер телефона")
        var number: Long? = null
        while (number == null) {
            val input = readln()
            try {
                number = input.toLong()
            } catch (e: NumberFormatException) {
                println("Ошибка: ${e::class.simpleName} введите корректный номер")
            }
        }
        println("Введите компанию:")
        val company = readln()
        contact.add(ContactsBookAddNew(name, number, company))
        println("Контакт добавлен!")
    } while (true)
}

class ContactsBookAddNew(
    val name: String,
    val number: Long,
    val company: String? = null,
) {

    fun showInfo() {
        println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "<не указано>"}")
    }
}