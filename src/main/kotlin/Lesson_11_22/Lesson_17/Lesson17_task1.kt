package org.example.Lesson_11_22.Lesson_17

fun main() {
    val quiz = Quiz(
        "Question",
        "Answer"
    )

    println(quiz.answer)
    println(quiz.question)
}

class Quiz(
    question: String,
    answer: String,
) {
    val question: String = question
        get() = field
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}