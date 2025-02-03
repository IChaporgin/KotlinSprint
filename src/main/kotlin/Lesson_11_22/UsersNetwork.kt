package org.example.Lesson_11_22

class UsersNetwork(
    val avatar: String,
    val nickName: String,
    var status: Status,
) {

}

enum class Status {
    SPEAK, MIC_OFF, MUTED
}