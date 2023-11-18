import kotlin.math.pow

fun main() {
    println("Введите данные x: ")
    val inputX = readln().toDouble() // Ввод данных x

    println("Введите данные n: ")
    var inputN = readln().toDouble() // Ввод данных n

    if (inputN != null && inputX != null) {
        var exponent = 0 // Инициализация показателя степени

        // Проверка условия, пока x^exponent не равно n
        while (inputX.pow(exponent).toDouble() != inputN) {
            // Если x^exponent превышает n, то выход из цикла
            if (inputX.toDouble().pow(exponent).toInt() > inputN) {
                println("Целочисленный показатель не существует")
                return
            }
            exponent++ // Увеличение показателя степени
        }

        println("Целочисленный показатель степени: $exponent") // Вывод целочисленного показателя степени
    } else {
        println("Ошибка ввода")
    }
}
