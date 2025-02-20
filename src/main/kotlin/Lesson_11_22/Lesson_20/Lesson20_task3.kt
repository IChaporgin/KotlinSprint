package org.example.Lesson_11_22.Lesson_20

fun main() {
    val user = UserKey(true)
    val checkKey: (UserKey) -> String = { userCheck ->
        if (userCheck.key) "Игрок открыл дверь" else "Дверь заперта"
    }
    println(checkKey(user))
    user.key = false
    println(checkKey(user))
}

class UserKey(
    var key: Boolean,
)