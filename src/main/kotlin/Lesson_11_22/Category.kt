package org.example.Lesson_11_22

class Category(
    val id: Int,
    val name: String,
    val dishes: MutableSet<Recipe> = mutableSetOf()
) {
}