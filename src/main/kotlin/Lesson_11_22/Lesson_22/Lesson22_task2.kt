package org.example.Lesson_11_22.Lesson_22

fun main() {
    val book1 = RegularBook2("Author1", "Text1")
    val book2 = DataBook2("Author1", "Text1")

    println(book1)
//    обычный класс не печатает свойства, необходимо переопределять метод toString
    println(book2)
//    В data class уже переопределен метод toString


}

class RegularBook2(
    val author: String,
    val text: String,
)

data class DataBook2(
    val author: String,
    val text: String,
)