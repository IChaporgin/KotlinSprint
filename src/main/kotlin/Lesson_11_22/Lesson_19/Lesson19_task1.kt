package org.example.Lesson_11_22.Lesson_19

fun main() {
    for (i in Fish.entries) {
        println("В аквариум можно добавить: ${i.fishName}")
    }
}

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}