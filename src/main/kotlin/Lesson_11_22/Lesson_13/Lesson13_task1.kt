package org.example.Lesson_11_22.Lesson_13

fun main() {
    val phonebook1 = PhoneBook("Helga", 12345678, null)
    var phonebook2 = PhoneBook("Liza", 87654321, "GPT")
}

class PhoneBook(
    val name: String,
    val number: Long,
    val company: String?,
) {
}