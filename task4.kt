fun main() {
    println("Введите два числа и операцию (например, 10.5 2 +):")
    val a = readLine()?.trim() ?: ""

    if (a.isEmpty()) {
        println("Ввод не может быть пустым.")
        return
    }

    val parts = a.split(" ")
    if (parts.size != 3) {
        println("Некорректный ввод. Введите числа и операцию через пробел.")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operation = parts[2]

    if (num1 == null || num2 == null) {
        println("Некорректный ввод. Введите два числа.")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
                "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль невозможно.")
                return
            }
            num1 / num2
        }
        else -> {
            println("Некорректная операция.")
            return
        }
    }

    println("Результат: $result")
}
