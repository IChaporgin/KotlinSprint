package org.example.Lesson_11_22

class Room(
    val image: String,
    val name: String,
    val users: MutableList<UsersNetwork> = mutableListOf(),
) {


    fun joinUser(user: UsersNetwork){
        users.add(user)
    }

    fun changeStatus(nickName: String, status: Status){
       val user = users.find { it.nickName == nickName }
        if (user != null) {
            user.status = status
        }
    }
}