package org.example.Lesson_11_22.Lesson_22

fun main() {
    val values = NewValues(
        "text",
        "author",
        "description"
    )

    val (text, author, description) = values
    println("Text: $text")
    println("Author: $author")
    println("Description: $description")
}

data class NewValues(
    val text: String,
    val author: String,
    val description: String,
)