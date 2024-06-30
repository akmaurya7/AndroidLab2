fun SumOfList(arr: List<Int>):Int {
    var sum = 0;
    for(i in arr){
        sum += i
    }
    return sum
}

fun main(){
    var arr = listOf(1,2,3,4,5)
    println("Sum: ${SumOfList(arr)}")
}