import kotlin.math.pow

fun main() {
// Ввод данных 1
    println("Введите данные 1: ")
    val number1 = readln().toInt()

// Ввод данных 2
    println("Введите данные 2: ")
    val number2 = readln().toInt()

    var oddCount = 0 // Счетчик нечетных чисел

    if ((number1 + number2) % 2 != 0) { // Проверка суммы на нечетность
        oddCount++
        println("Создать нечетное число возможно при сложении : " + (number1 + number2))
    }

    if ((number1 - number2) % 2 != 0) { // Проверка разности на нечетность
        oddCount++
        println("Создать нечетное число возможно при вычитании : " + (number1 - number2))

        if ((number2 - number1) % 2 != 0) { // Проверка обратной разности на нечетность
            oddCount++
            println("Создать нечетное число возможно при вычитании : " + (number2 - number1))
        }
    }

    if ((number1 * number2) % 2 != 0) { // Проверка произведения на нечетность
        oddCount++
        println("Создать нечетное число возможно при умножении : " + (number1 * number2))
    }

    if ((number1 / number2) % 2 != 0) { // Проверка деления на нечетность
        oddCount++
        println("Создать нечетное число возможно при делении : " + (number1 / number2))

        if ((number2 / number1) % 2 != 0) { // Проверка обратного деления на нечетность
            oddCount++
            println("Создать нечетное число возможно при делении : " + (number2 / number1))
        }
    }

    if (number1.toDouble().pow(number2) % 2 != 0.toDouble()) { // Проверка возведения в степень на нечетность
        oddCount++
        println("Создать нечетное число возможно при возведении в степень: " + (number1.toDouble().pow(number2)))

        if (number2.toDouble().pow(number1) % 2 != 0.toDouble()) { // Проверка обратного возведения в степень на нечетность
            oddCount++
            println("Создать нечетное число возможно при возведении в степень: " + (number2.toDouble().pow(number1)))
        }
    }

    if (oddCount == 0) // Вывод сообщения об отсутствии возможности создать нечетное число
        println("Создать нечетное число невозможно")
}
