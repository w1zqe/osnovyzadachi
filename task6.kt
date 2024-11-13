fun main() {
    println("Введите первую цифру:")
    val digit1 = readLine()?.toIntOrNull() ?: 0

    println("Введите вторую цифру:")
    val digit2 = readLine()?.toIntOrNull() ?: 0

    if (digit1 !in 0..9 || digit2 !in 0..9 || digit1 == digit2) {
        println("Создать нечетное число невозможно")
        return
    }

    val oddNumber = if (digit1 % 2 != 0) {
        digit1 * 10 + digit2 // Correct: digit1 10 + digit2
    } else {
        digit2 * 10 + digit1 // Correct: digit2 10 + digit1
    }

    println("Нечетное число: $oddNumber")
}
