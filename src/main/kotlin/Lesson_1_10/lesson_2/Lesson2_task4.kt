fun main() {
    val baff = 20
    val percent = 100
    val cristallOre = 7
    val ironOre = 11

    val cristallOreBaff = cristallOre * baff / percent
    val ironOreBaff = ironOre * baff / percent

    println("Бафф составляет ${baff}% Вы получили $cristallOreBaff единицы кристаллической руды!")
    println("Бафф составляет ${baff}% Вы получили $ironOreBaff единицы железной руды!")


}