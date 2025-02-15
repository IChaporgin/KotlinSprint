package org.example.Lesson_11_22.Lesson_15

fun main() {
    val guitar = Instrument(
        "Гитара",
        10,
    )
    val strings = Parts(
        "Струны",
        20
    )

    guitar.search()
}

abstract class MusicalParts(
    val name: String,
    val count: Int,
)

interface SearchProduct {
    fun search()
}

class Instrument(
    name: String,
    count: Int,
) : MusicalParts(name, count), SearchProduct {
    override fun search() {
        println("Выполняется поиск......")
    }
}

class Parts(
    name: String,
    count: Int,
) : MusicalParts(name, count)