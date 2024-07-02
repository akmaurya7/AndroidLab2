import kotlinx.coroutines.*

fun main() {
    
    val arr = intArrayOf(1, 2, 3)
    try {
        println(arr[4])
    } catch (e: Exception) {
        println("caught exception: ${e.message}")
    } finally {
        println("Program completed")
    }   
    
}
