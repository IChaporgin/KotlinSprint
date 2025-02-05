package org.example.Lesson_11_22

fun main() {

    val user = User2(
        id = 2,
        login = "Bob",
        password = "123",
        email = "bob@bob.com",
    )

    user.getInformation()
    user.getBio()
    user.changePassword()
    user.getInformation()
}

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
){

    fun getInformation(){
        println("ID: $id\nLogin: $login\nPassword: $password\nEmail: $email\nBio:$bio")
    }

    fun getBio(){
        println("Информация: $bio\nХотите изменить?")
        if (readln().lowercase() == "да"){
            println("Введите новую информацию:")
            this.bio = readln()
            println("Информация обновлена!")
        }
    }

    fun changePassword(){
        println("Введите старый пароль:")
        if (readln() == password){
            println("Введите новый пароль:")
            this.password = readln()
            println("Пароль обновлен!")
        } else {
            println("Неверный пароль")
        }
    }
}