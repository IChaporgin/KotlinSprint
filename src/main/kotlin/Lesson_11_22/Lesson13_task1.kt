package org.example.Lesson_11_22

fun main() {
    val name = PhoneBook(
        "asd",
        1231313121,
        null
    )

}

class PhoneBook(
    val name: String,
    val number: Long,
    val company: String?
)