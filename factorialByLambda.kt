fun calculateFactorial(n: Int): Long {
    val factorial: (Int) -> Long = {
        var result: Long = 1
        for (i in 1..it) {
            result *= i
        }
        result
    }
    return factorial(n)
}

fun main() {
    val number = 5
    val factorial = calculateFactorial(number)
    println("Factorial of $number is: $factorial")
}
