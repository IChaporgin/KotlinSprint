package org.example.Lesson_11_22.Lesson_11

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Bob")
    val user2 = forum.createNewUser("Mike")

    forum.createNewMessage(user1.userId, "Hello!")
    forum.createNewMessage(user2.userId, "Good bye!")
    forum.printThread()
}

class Forum(
    private val users: MutableList<UserForum> = mutableListOf(),
    private val messages: MutableList<MessageForum> = mutableListOf(),
    private var userIdCounter: Int = 1,
    ) {
    fun createNewUser(userName: String) : UserForum {
        val user = UserForum(userIdCounter++, userName)
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String) : Boolean {
        val userExist = users.any { it.userId == authorId }
        if (userExist){
            messages.add(MessageForum(authorId, message))
            return true
        } else {
            return false
        }
    }

    fun printThread(){
        for (message in messages){
            val user = users.find { it.userId == message.authorId }
            println("${user?.userName} : ${message.message}")
        }
    }
}

class MessageForum(
    val authorId: Int,
    val message: String,
) {
}

class UserForum(
    val userId: Int,
    val userName: String,
) {
}
