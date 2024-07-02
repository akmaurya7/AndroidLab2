import kotlinx.coroutines.*

class InvalidAge(message: String):Exception(message)

fun main()  {
    
    val age =20
    try {
        if(age<18){
            throw InvalidAge("Under Age")
        }
        else{
            println("you are eligible to drink bear")
        }
    }
    catch(e:Exception){
        println("caught exception: ${e.message}")
    }
    finally{
        println("Program completed")
    }   
    
}
