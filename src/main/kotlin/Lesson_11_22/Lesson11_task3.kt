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