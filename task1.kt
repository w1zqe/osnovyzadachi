fun main() {
    println("Введите строку:")
    val a = readLine() ?: ""

    if (a.isEmpty()) {
        println("Строка не может быть пустой.")
        return
    }

    val b = StringBuilder()
    var c = a[0]
    var count = 1

    for (i in 1 until a.length) {
        if (a[i] == c) {
            count++
        } else {
            if (count > 1) {
                b.append(c).append(count)
            } else {
                b.append(c)
            }
            c = a[i]
            count = 1
        }
    }

    if (count > 1) {
        b.append(c).append(count)
    } else {
        b.append(c)
    }

    println("Результат: $b")
}