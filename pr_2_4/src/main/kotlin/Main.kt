fun main() {
    println("Введите 3 переменные через пробел: (ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ) ")

// Считывание строки с вводом пользователем
    val inputString = readLine()

// Разделение строки на отдельные значения по пробелу и сохранение в список
    val inputList = inputString?.split(" ")

// Преобразование первых двух значений в целые числа и сохранение в переменные num1 и num2
    val num1 = inputList!![0].toInt()
    val num2 = inputList!![1].toInt()

// Получение значения операции и сохранение в переменной operator
    val operator = inputList!![2].toString()

// Инициализация переменной result
    var result = 0

// Выполнение операции в зависимости от значения operator
    if (operator == "-") {
        result = num1 - num2
    }
    if (operator == "+") {
        result = num1 + num2
    }
    if (operator == "/") {
        result = num1 / num2
    }
    if (operator == "*") {
        result = num1 * num2
    }

// Вывод результата
    println(result)
}
