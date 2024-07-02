import kotlinx.coroutines.*

fun main() = runBlocking {
    
    val a = 10
    var b = 0;
    try {
        var res = a/b
        println(res)
    }
    catch(e:Exception){
        println("caught exception: ${e.message}")
    }
    
    
}
