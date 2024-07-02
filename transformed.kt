fun transformList(strings: List<String>, transformer: (String) -> String): List<String> {
    return strings.map { transformer(it) }
}

fun main() {
    val names = listOf("Ram", "Adarsh","Kunal", "Dibya")

    val transformed = transformList(names) { it.toUpperCase() }

    println("Original names: $names")
    println("Transformed names: $transformed")
}
