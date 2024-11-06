fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5
    val countOfStudents = 4
    val averageScore: Float = (student1.toFloat() + student2.toFloat() + student3.toFloat()
            + student4.toFloat()) / countOfStudents

    println("Average score: $averageScore")
}