fun addNumberClosure(no1:Int,no2:Int): (Int,Int) -> Int {
    return { num1,num2 -> no1 + no2 + num1 + num2}
}

fun main() {
    
    val add = addNumberClosure(5,6)
    val res = add(4,8)
    println(res)

 
}
