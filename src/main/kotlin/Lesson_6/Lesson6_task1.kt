package org.example.Lesson_6
/*
На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию. Нужно создать блок программы,
который сначала предлагает создать логин и пароль, затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново. Если данные верны,
выводится сообщение – “Авторизация прошла успешно”.
 */
fun main() {
    println("Введите ваш логин для регистрации:")
    val login: String = readln()
    println("Введите пароль:")
    val password: String = readln()

//    do {
//        println("Введите логин для входа в систему:")
//        val checkLog: String = readln()
//        println("Введите пароль для входа в систему:")
//        val checkPas: String = readln()
//    } while (checkLog != login && checkPas != password)

    while (true) {
        println("Введите логин для входа в систему:")
        val checkLog: String = readln()
        println("Введите пароль для входа в систему:")
        val checkPas: String = readln()

        if (checkLog == login && checkPas == password) {
            break
        } else {
            println("Ошибка логина или пароля!")
        }
    }

    println("Авторизация прошла успешно")
}