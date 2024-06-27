fun main() {
    val no = 153
    var temp = no
    var sum = 0
    val dc = no.toString().length
    
    while (temp != 0) {
        val digit = temp % 10
        sum = sum + Math.pow(digit.toDouble(), dc.toDouble()).toInt()
        temp /= 10
    }

    if (sum == no) {
        println("$no is an armstrong number")
    } else {
        println("$no is not an armstrong number")
    }
}
