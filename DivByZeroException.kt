import kotlinx.coroutines.*

fun main()  {
    
    val a = 10
    var b = 0;
    try {
        var res = a/b
        println(res)
    }
    catch(e:Exception){
        println("caught exception: ${e.message}")
    }
    finally{
        println("Program completed")
    }
    
    
}
