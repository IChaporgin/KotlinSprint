package org.example.Lesson_11_22.Lesson_17

fun main() {
    val folder = Folder("First", 10)
    println(folder.folderName)
    println(folder.folderCount)
    folder.private = true
    println(folder.folderName)
    println(folder.folderCount)
    folder.private = false
    println(folder.folderName)
    println(folder.folderCount)
}

class Folder(
    private val name: String,
    private val count: Int,
    var private: Boolean = false,
) {
    val folderName: String
        get() = if (!private) this.name else "Скрытая папка"

    val folderCount: Int
        get() = if (private) 0 else count
}