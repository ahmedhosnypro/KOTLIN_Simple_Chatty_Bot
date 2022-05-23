class Pirate(name: String) {
    var name: String = name
        private set
}

fun main() {
    val captain = Pirate("Hector Barbossa")
    println(captain.name)
    // put your code here


}