package org.example.Lesson_11_22.Lesson_14

fun main() {
    val mars = Planet(
        name = "Марс",
        isAtmosphere = true,
        isLanding = true,
        satellites = mutableListOf(
            Satellite("Деймос", false, true),
            Satellite("Фобос", false, true)
        )
    )

    mars.let {
        println(it.name)
        println(it.satellites.map { it.name })
    }
}

abstract class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isLanding: Boolean,
)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
    val satellites: MutableList<Satellite>,
) : CelestialBody(name, isAtmosphere, isLanding)

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
) : CelestialBody(name, isAtmosphere, isLanding)