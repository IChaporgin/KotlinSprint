fun main() {
    val baff = 0.2f
    val cristallOre = 7
    val ironOre = 11

    val cristallOreBaff = (cristallOre * baff).toInt()
    val ironOreBaff = (ironOre * baff).toInt()

    println("Бафф составляет ${(baff * 100).toInt()}% Вы получили $cristallOreBaff единицы кристаллической руды!")
    println("Бафф составляет ${(baff * 100).toInt()}% Вы получили $ironOreBaff единицы железной руды!")


}