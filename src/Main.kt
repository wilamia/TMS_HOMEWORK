/* Написать программу, которая
 проверяет является ли число палиндромом */
fun isPalindrome() {
    println("Enter number: ")
    val number = readln().toInt().toString()

    when {
        number == number.reversed() ->
            println("Number is palindrome")

        else ->
            println("Number isn't palindrome")
    }

    return main()
}

/* Определить является ли число простым */
fun isSimple() {
    println("Enter number: ")
    val number = readln().toInt()
    var isTrue = true

    for (count in 2 until number) {
        if (number % count == 0 || number <= 0)
            isTrue = false
    }

    println(when (isTrue) {
        false -> "Number isn't simple"
        else -> "Number is simple"
    })

    return main()
}

/* Вычислить сумму цифр числа до единичного разряда */
fun sumOfDigits() {
    println("Enter number: ")
    var number = readln().toInt()

    println(sumOfDigitsRecurse(number))

    return main()
}

fun sumOfDigitsRecurse(num: Int): Int {
    when (num) {
        in 1..10 ->
            return num

        else -> {
            return sumOfDigitsRecurse((num % 10) + sumOfDigitsRecurse(num / 10))
        }
    }
}

/* Вывеcти перевернутую лесенку высотой n */
fun reverseStairs() {
    println("Enter number: ")
    var number = readln().toInt()

    while (number > 0) {
        for (count in 1..number) {
            print('#')
        }
        println()
        number--
    }

    return main()
}

fun main() {
    println("\nEnter number of task: ")
    val task = readln().toInt()
    when (task) {
        1 -> isPalindrome()
        2 -> isSimple()
        3 -> sumOfDigits()
        4 -> reverseStairs()
        else -> println("Exit...")
    }
}