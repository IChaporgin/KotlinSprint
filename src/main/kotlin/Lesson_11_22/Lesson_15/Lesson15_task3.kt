package org.example.Lesson_11_22.Lesson_15

fun main() {
    val user1 = User1("Bob")
    val admin1 = Administrator("Alice")

    user1.readMessage()
    user1.writeMessage()

    admin1.readMessage()
    admin1.writeMessage()
    admin1.deleteUser(user1)
    admin1.deleteMessage()
}

abstract class ForumUser(
    val name: String
) {
    abstract fun readMessage()
    abstract fun writeMessage()
}

class User1(
    name: String,
) : ForumUser(name) {
    override fun readMessage() {
        println("Пользователь $name читает сообщение.")
    }

    override fun writeMessage() {
        println("Пользователь $name пишет сообщение.")
    }
}

class Administrator(
    name: String,
) : ForumUser(name) {
    override fun readMessage() {
        println("Администратор $name читает сообщение.")
    }

    override fun writeMessage() {
        println("Администратор $name пишет сообщение.")
    }

    fun deleteUser(user: User1) {
        println("Администратор $name удалил пользователя ${user.name}.")
    }

    fun deleteMessage() {
        println("Администратор $name удалил сообщение.")
    }
}