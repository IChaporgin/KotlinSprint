package org.example

import org.example.Lesson_11_22.Recipe

class Category(
    val id: Int,
    val name: String,
    val dishes: MutableSet<Recipe> = mutableSetOf()
) {
}