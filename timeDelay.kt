import kotlinx.coroutines.*

suspend fun <T> withTimeoutTask(timeMillis: Long, block: suspend CoroutineScope.() -> T): T? {
    return withTimeoutOrNull(timeMillis) {
        block()
    }
}

fun main() = runBlocking {
    val result = withTimeoutTask(2000L) {
                for (i in 1..10) {
            println(i)
            delay(500L) 
        }
        "Task completed successfully."
    }

    if (result != null) {
        println(result)
    } else {
        println("Task terminated")
    }

    println("Program completed")
}
