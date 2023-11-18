fun main() {
    println("Введите число в десятичной системе счисления: ")

// Считывание числа в десятичной системе счисления
    val decimalNumber = readLine()!!.toInt()

// Преобразование числа в двоичную систему счисления
    val binaryNumber = decimalNumber.toString(2)

// Вывод числа в двоичной системе счисления
    println(binaryNumber)
}
