fun main() {
    val num1 = 54
    val num2 = 24

    var a = num1
    var b = num2

  
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    
    println("The gcd of $num1 and $num2 is $a")
}
