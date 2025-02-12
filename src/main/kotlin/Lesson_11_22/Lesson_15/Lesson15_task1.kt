package org.example.Lesson_11_22.Lesson_15

fun main() {
    val seagull = Seagull("Чайка")
    seagull.flies()
    val crucian = Crucian("Карп")
    crucian.floats()
    val duck = Duck("Утка")
    duck.floats()
    duck.flies()
}

interface FlyingCreature {
    fun flies()
}

interface FloatingCreature {
    fun floats()
}

class Seagull(
    val name: String
) : FlyingCreature {
    override fun flies() {
        println("$name летает")
    }
}

class Crucian(
    val name: String
) : FloatingCreature {
    override fun floats() {
        println("$name плывет")
    }
}

class Duck(
   val name: String
) : FloatingCreature, FlyingCreature {
    override fun floats() {
        println("$name плывет")
    }
    override fun flies() {
        println("$name летает")
    }
}