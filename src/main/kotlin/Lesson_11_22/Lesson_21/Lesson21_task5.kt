package org.example.Lesson_11_22.Lesson_21

fun main() {
    val skills: Map<String, Int> = mapOf("Health" to 100, "Damage" to 100, "Agility" to 70)
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory() : String {
    return this.maxByOrNull { it.value }.toString()
}