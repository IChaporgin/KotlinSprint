package org.example.Lesson_11_22.Lesson_18

fun main() {
    val animals: List<Animal> = listOf(Dog("Бобик"), Cat("Мурзик"), Fox("Рыжик"))
    animals.forEach { it.animalEat() }
}

open class Animal(
    open val name: String,
) {
    open fun animalEat() {}
    open fun animalSleep() {
        println("$name спит")
    }
}

class Dog(
    name: String
) : Animal(name) {
    override fun animalEat() {
        println("$name есть кость")
    }
}

class Cat(
    name: String
) : Animal(name) {
    override fun animalEat() {
        println("$name есть рыбу")
    }
}

class Fox(
    name: String
) : Animal(name) {
    override fun animalEat() {
        println("$name есть ягоды")
    }
}