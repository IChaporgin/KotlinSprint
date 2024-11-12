fun main() {
    val day = 1
    val upperWorkout = day % EVEN == 0
    val lowerWorkout = !upperWorkout
    val result = """
        Упражнения для рук: $upperWorkout
        Упражнения для ног: $lowerWorkout
        Упражнения для спины: $upperWorkout
        Упражнения для пресса: $lowerWorkout
    """.trimIndent()
    println(result)
}

const val EVEN = 2