package org.example.Lesson_11_22.Lesson_22

fun main() {
    val view = MainScreenViewModel()
    view.loadData()
}

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()
    fun loadData() {
        println("- отсутствие данных")
       Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(data = "- загрузка данных", isLoading = true)
        println(mainScreenState.data)
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(data = "- наличие загруженных данных.", isLoading = false)
        println(mainScreenState.data)
    }
}