package org.example.Lesson_11_22.Lesson_17

fun main() {
    val user = NewUser("log", "pas")
    user.login = "log1"
    println(user.login)
    user.password = "asdasd"
    println(user.password)
}

class NewUser(
    login: String,
    password: String,
) {
    var login: String = login
        set(value) {
            if (field != value){
            println("Вы успешно изменили логин")
            field = value
            }
        }
    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            if (field != value) {
                println("Вы не можете изменить пароль")
            }
        }
}