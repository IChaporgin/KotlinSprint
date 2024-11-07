fun main() {
    val name = readln()
    val morningGreeting = "Доброе утро! "
    val eveningGreeting = "Добрый вечер! "
    var greeting = morningGreeting + name
    println(greeting)
    greeting = eveningGreeting + name
    println(greeting)
}