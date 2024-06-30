fun factorial(no: Int): Int {
    return if (no == 0) 1 else no * factorial(no - 1)
}

fun main() {
    println("Factorial: ${factorial(5)}")
}
