fun sortByAge(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return people.sortedBy { it.second }
}

fun main() {
    val people = listOf(
        Pair("Ram", 30),
        Pair("shyam", 25),
        Pair("Adarsh", 35),
        Pair("Mohan", 28)
    )
    
    val sortedPeople = sortByAge(people)
    
    println("Sorted by age: $sortedPeople")
}
