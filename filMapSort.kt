fun processStrings(strings: List<String>, startsWith: Char): List<String> {
    return strings
        .filter { it.startsWith(startsWith) }
        .map { it.toUpperCase() }
        .sorted()
}

fun main() {
    val words = listOf("apple", "banana", "apricot", "cherry", "blueberry", "kiwi")

    val processed = processStrings(words, 'a')

    println("Original list: $words")
    println("Processed list: $processed")
}
