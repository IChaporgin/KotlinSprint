package org.example.Lesson_11_22.Lesson_18

fun main() {
    val listDice: List<Dice> = listOf(Tetraeder(), Cube(), Octaeder())
    listDice.forEach { println(it.showEdge()) }

}

open class Dice(
   open val edge: Int
) {
   open fun showEdge() = ""
}

class Tetraeder(
    edge: Int = 4,
) : Dice(edge) {
    override fun showEdge(): String {
        return "Тетраэдр выпало: ${(1..edge).random()}"
    }
}

class Cube(
    edge: Int = 6,
) : Dice(edge) {
    override fun showEdge(): String {
        return "Куб выпало: ${(1..edge).random()}"
    }
}

class Octaeder(
    edge: Int = 8,
) : Dice(edge) {
    override fun showEdge(): String {
        return "Октаедр выпало: ${(1..edge).random()}"
    }
}