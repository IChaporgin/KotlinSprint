fun main() {
    val day = 1
    val upperWorkout = day % EVEN == 0
    val result = """
        Упражнения для рук: $upperWorkout
        Упражнения для ног: ${!upperWorkout}
        Упражнения для спины: $upperWorkout
        Упражнения для пресса: ${!upperWorkout}
    """.trimIndent()
    println(result)
}

const val EVEN = 2