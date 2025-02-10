package org.example.Lesson_11_22.Lesson_13

fun main() {
    val contact1 = NewPhoneBook("Liza", 12345678)
    val contact2 = NewPhoneBook("Helga", 87654321, "GPT")
    contact1.showInfo()
    contact2.showInfo()

}

class NewPhoneBook(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun showInfo() {
        println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "<не указано>"}")
    }
}