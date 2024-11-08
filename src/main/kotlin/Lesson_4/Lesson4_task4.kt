fun main() {
    val day = 1
    val armWorkout = day % EVEN == 0
    val legWorkout = day % EVEN != 0
    val backWorkout = day % EVEN != 0
    val adbWorkout = day % EVEN == 0

    println("""
        Упражнения для рук: $armWorkout
        Упражнения для ног: $legWorkout
        Упражнения для спины: $backWorkout
        Упражнения для пресса: $adbWorkout
    """.trimIndent())

}

const val EVEN = 2