package org.example.Lesson_11_22.Lesson_11

fun main() {

}

class Category(
    val id: Int,
    val name: String,
    val dishes: MutableSet<Recipe> = mutableSetOf()
) {
}

class Ingredients(
    val id: Int,
    val name: String,
) {
}

class Recipe(
    val id: Int,
    val portion: Int,
    val ingredients: MutableMap<Ingredients, Int> = mutableMapOf(),
    val description: String,
    val inFavorite: Boolean = false
) {

}