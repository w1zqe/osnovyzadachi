fun main() {
    println("Введите натуральное число в десятичной системе счисления:")
    val a = readLine()?.toIntOrNull()

    if (a == null || a <= 0) {
        println("Некорректный ввод. Введите натуральное число.")
        return
    }

    var number = a
    val binaryStringBuilder = StringBuilder()

    while (number > 0) {
        binaryStringBuilder.append(number % 2)
        number /= 2
    }

    val b = binaryStringBuilder.reverse().toString()

    println("Двоичное представление числа $a: $b")
}
