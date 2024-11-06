fun main() {
    val countOfEmployees = 50
    val countOfInterns = 30
    val salaryEmployee = 30000
    val salaryIntern = 20000

    val sumOfSalariesEmployees = countOfEmployees * salaryEmployee
    val sumOfSalariesIntern = countOfInterns * salaryIntern
    val totalSalaries = sumOfSalariesEmployees + sumOfSalariesIntern
    val averageSalaries = totalSalaries / (countOfEmployees + countOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $sumOfSalariesEmployees руб.")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaries руб.")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalaries руб.")


}