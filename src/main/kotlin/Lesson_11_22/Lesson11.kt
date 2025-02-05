package org.example.Lesson_11_22

fun main() {
    val room = Room(
        image = "https:....",
        name = "Room1"
    )
    val user1 = UsersNetwork(
        avatar = "avatar.png",
        nickName = "User1",
        status = Status.MIC_OFF
    )
    val user2 = UsersNetwork(
        avatar = "avanar2.png",
        nickName = "User2",
        status = Status.SPEAK
    )

    room.joinUser(user1)
    room.joinUser(user2)
    room.changeStatus("User1", Status.MUTED)
    println(room.users[0].status)
    println(room.users[1].status)

    room.users.forEachIndexed { index, usersNetwork -> println("№ ${index + 1} Ник: ${usersNetwork.nickName} Статус: ${usersNetwork.status}") }
}

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

class UsersNetwork(
    val avatar: String,
    val nickName: String,
    var status: Status,
) {

}

enum class Status {
    SPEAK, MIC_OFF, MUTED
}