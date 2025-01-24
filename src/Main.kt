import kotlin.random.Random

fun main() {
    searchMaxMinValue()
    countEvenOddNumbers()
    reverseArray()
    isPalindrome()
}

/*Напишите программу, которая находит и выводит максимальное и минимальное
значение в массиве целых чисел. Также вычислите индекс этих элементов*/

fun searchMaxMinValue() {
    var maxValue = Integer.MIN_VALUE;
    var maxIndex = 0;
    var minValue = Integer.MAX_VALUE;
    var minIndex = 0;
    var array = emptyArray<Int>()

    println("Введите длину массива: ")
    val length = readln().toInt()

    for (i in 0 until length) {
        array += Random.nextInt(1, 10)
    }

    for (i in 0 until length) {
        print("${array[i]} ")
        when {
            array[i] > maxValue -> {
                maxValue = array[i]
                maxIndex = i;
            }

            array[i] < minValue -> {
                minValue = array[i]
                minIndex = i;
            }
        }
    }

    println()

    when {
        maxValue == 0 && minValue == 0 -> return
        else -> println(
            "Максимальное число: $maxValue" +
                    "\nИндекс максимального числа: $maxIndex" +
                    "\nМинимальное число: $minValue" +
                    "\nИндекс минимального числа: $minIndex"
        )
    }
}

/*Напишите программу, которая принимает массив целых чисел и подсчитывает,
сколько четных и сколько нечетных чисел в нем содержится*/

fun countEvenOddNumbers() {
    var evenNumbers = 0;
    var oddNumbers = 0;
    var array = emptyArray<Int>()

    println("Введите длину массива: ")
    val length = readln().toInt()
    for (i in 0 until length) {
        array += Random.nextInt(1, 10)
        print("${array[i]} ")
    }
    println()

    for (value in array) {
        when {
            value % 2 == 0 -> evenNumbers++
            else -> oddNumbers++
        }
    }
    when {
        evenNumbers == 0 && oddNumbers == 0 -> return
        else -> println("Количество четных чисел: $evenNumbers \nКоличество нечетных чисел: $oddNumbers")
    }
}

/*Напишите программу, которая принимает массив целых чисел и изменяет его порядок
на обратный. Выведите результат после изменения порядка*/

fun reverseArray() {
    var array = emptyArray<Int>()
    var firstHalfValue: Int
    var secondHalfValue: Int

    println("Введите длину массива: ")
    var length = readln().toInt()

    println("Введите числа массива: ")
    for (i in 0 until length) {
        array += readln().toInt()
    }

    for (value in array) {
        print("$value ")
    }
    println()

    for (i in 0 until length / 2) {
        firstHalfValue = array[i]
        secondHalfValue = array[length - 1]
        array[i] = secondHalfValue
        array[length - 1] = firstHalfValue
        length--
    }

    for (value in array) {
        print("$value ")
    }
    println()
}

/*Напишите программу, которая проверяет,
является ли массив чисел палиндромом.*/

fun isPalindrome() {
    var array = emptyArray<Int>()

    println("Введите длину массива: ")
    var length = readln().toInt()
    var isPalindrome = true

    println("Введите числа массива: ")
    for (i in 0 until length) {
        array += readln().toInt()
    }

    for (value in array) {
        print("$value ")
    }
    println()

    for (i in 0 until length / 2) {
        if (array[i] != array[length - 1]) {
            isPalindrome = false
            break
        }
        length--
    }

    when {
        isPalindrome -> println("Массив является палиндромом")
        else -> println("Массив не является палиндромом")
    }

}