fun main() {
    println("Введите строку:")
    val a = readLine() ?: ""

    if (a.isEmpty()) {
        println("Строка не может быть пустой.")
        return
    }

    val charCounts = mutableMapOf<Char, Int>()

    for (char in a) {
        charCounts[char] = (charCounts[char] ?: 0) + 1
    }

    val b = charCounts.keys.sorted()

    for (char in b) {
        println("$char - ${charCounts[char]}")
    }
}
