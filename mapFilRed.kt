fun main() {
    val no = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sqNo = no.map { it * it }

    val filEvenNo = sqNo.filter { it % 2 == 0 }
    val filOddNo = sqNo.filter { it % 2!= 0}

    val sum = filOddNo.reduce { acc, num -> acc + num }

    println("Original numbers: $no")
    println("Squared numbers: $sqNo")
    println("Filtered even numbers: $filEvenNo")
    println("Sum of remaining numbers: $sum")
}
