fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull() ?: 0

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull() ?: 0

    if (n <= 0 || x <= 0) {
        println("Некорректный ввод. Введите натуральные числа.")
        return
    }

    var y = 0
    var power = 1

    while (power < n) {
        power *= x
        y++
    }

    if (power == n) {
        println("Целочисленный показатель степени: $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}
