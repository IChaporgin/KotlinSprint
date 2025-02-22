package org.example.Lesson_11_22.Lesson_22

fun main() {
    val book1 = RegularBook("Author1", "Text1")
    val book2 = RegularBook("Author1", "Text1")
    val book3 = DataBook("Author2", "Text2")
    val book4 = DataBook("Author2", "Text2")

    println(book1 == book2)
//    В обычных классах сравниваются ссылки на объект, а они разные
    println(book3 == book4)
// В data class сравниваются значения класса, поэтому результат будет true

}

class RegularBook(
    val author: String,
    val text: String,
)

data class DataBook(
    val author: String,
    val text: String,
)