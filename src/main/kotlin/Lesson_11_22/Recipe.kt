package org.example.Lesson_11_22

class Recipe(
    val id: Int,
    val portion: Int,
    val ingredients: MutableMap<Ingredients, Int> = mutableMapOf(),
    val description: String,
    val inFavorite: Boolean = false
) {

}