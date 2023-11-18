fun countDuplicates(input: String): String {
    val resultString = StringBuilder()
    var count = 1

// Проходит по каждому символу строки, начиная со второго символа
    for (i in 1 until input.length) {
// Если текущий символ равен предыдущему символу
        if (input[i] == input[i - 1]) {
            count++ // Увеличивает счетчик дублирования
        } else {
// Если текущий символ отличается от предыдущего
            resultString.append(input[i - 1]) // Добавляет предыдущий символ в результатную строку

// Если количество дублирования предыдущего символа больше 1
            if (count > 1) {
                resultString.append(count) // Добавляет количество дублирования в результатную строку
            }

            count = 1 // Сбрасывает счетчик дублирования
        }
    }

// Добавляет последний символ в результатную строку
    resultString.append(input[input.length - 1])

// Если количество дублирования последнего символа больше 1
    if (count > 1) {
        resultString.append(count) // Добавляет количество дублирования в результатную строку
    }

    return resultString.toString() // Возвращает результатную строку
}

fun main() {
    println("Введите строку символов: ")
    val userInput = readLine().toString()
    val output = countDuplicates(userInput)
    println(output)
}
