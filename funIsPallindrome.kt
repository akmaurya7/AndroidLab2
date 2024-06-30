fun isPalindrome(dig: String) {
    val digHalfCount = dig.length / 2
    var isPalindrome = true
    for (i in 0 until digHalfCount) {
        if (dig[i] != dig[dig.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }
    if (isPalindrome) {
        println("Given number is a palindrome")
    } else {
        println("Given number is not a palindrome")
    }
}

fun main() {
    isPalindrome("121")
}
