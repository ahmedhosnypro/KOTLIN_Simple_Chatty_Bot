fun main() {
    val range = readln().toInt()..readln().toInt()
    for (num in range) {
        if (num % 15 == 0) {
            println("FizzBuzz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else {
            println(num)
        }
    }
}