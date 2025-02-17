package org.example.Lesson_11_22.Lesson_17

fun main() {
    val pack = Package(111, "Moscow")
    pack.location = "SPb"
    pack.location = "Moscow"
    println(pack.counter)
}

class Package(
    val track: Int,
    position: String
) {
    var location: String = position
        set(value) {
            if (field != value){
                field = value
                counter++
            }
        }
    var counter: Int = 0
        private set
}