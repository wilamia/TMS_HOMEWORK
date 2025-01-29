import kotlin.random.Random

fun main() {
    bubbleSort()
    sortSelect()
    sortInsert()
    sortQuick()
    sortIfAscendingOrDescending()
    deleteDuplicate()
    sortNegativeNumbers()
    sortArrayByFrequency()
    minValueOfRearrangement()
}

/*Задача 1. Сортировка пузырьком*/

fun bubbleSort() {
    val array = arrayOf(10, 7, 8, 9, 1, 5)
    var temp = 0
    var isSorted = false
    println(
        "----------------------------------\n" +
                "Сортировка пузырьком: \nНачальный массив: ${array.contentToString()}"
    )
    while (!isSorted) {
        isSorted = true
        for (i in 0 until array.lastIndex) {
            if (array[i] > array[i + 1]) {
                isSorted = false
                temp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = temp
            }
        }
    }
    println("Конечный массив: ${array.contentToString()}")
}

/*Задача 1. Сортировка выбором*/

fun sortSelect() {
    val array = arrayOf(10, 7, 8, 9, 1, 5)
    var minValue = 0
    var minIndex = 0
    println(
        "----------------------------------\n" +
                "Сортировка выбором: \nНачальный массив: ${array.contentToString()}"
    )
    for (i in 0 until array.lastIndex) {
        minIndex = i
        for (j in (i + 1)..array.lastIndex) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }

        if (minIndex != i) {
            minValue = array[minIndex]
            array[minIndex] = array[i]
            array[i] = minValue
        }
    }
    println("Конечный массив: ${array.contentToString()}")
}

/*Задача 1. Сортировка вставками*/

fun sortInsert() {
    val array = arrayOf(10, 7, 8, 9, 1, 5)
    var swap = 0
    println(
        "----------------------------------\n" +
                "Сортировка вставками: \nНачальный массив: ${array.contentToString()}"
    )
    for (i in 1..array.lastIndex) {
        swap = array[i]
        var j = i
        while (j > 0 && swap < array[j - 1]) {
            array[j] = array[j - 1]
            j--
        }
        array[j] = swap
    }
    println("Конечный массив: ${array.contentToString()}")
}

/*Задача 1. Быстрая сортировка*/

fun sortQuick() {
    val array = arrayOf(10, 7, 8, 9, 1, 5)
    println(
        "----------------------------------\n" +
                "Быстрая сортировка: \nНачальный массив: ${array.contentToString()}"
    )
    sortQuickStart(array, 0, array.lastIndex)
    println("Конечный массив: ${array.contentToString()}")
}

fun sortQuickStart(array: Array<Int>, low: Int, high: Int) {
    if (low < high) {
        val partition = partition(array, low, high)
        sortQuickStart(array, low, partition - 1)
        sortQuickStart(array, partition, high)
    }
}

fun partition(array: Array<Int>, low: Int, high: Int): Int {
    var left = low
    var right = high
    val pivot = array[low + (high - low) / 2]
    while (left <= right) {
        while (array[left] < pivot) {
            left++
        }

        while (array[right] > pivot) {
            right--
        }

        if (left <= right) {
            val temp = array[left]
            array[left] = array[right]
            array[right] = temp
            left++
            right--
        }
    }
    return left
}


/*Реализуйте функцию, которая принимает массив и булевое значение. Если значение
true, сортируйте массив по возрастанию, иначе по убыванию.*/

fun sortIfAscendingOrDescending() {
    val array = arrayOf(10, 7, 8, 9, 1, 5)
    println(
        "----------------------------------\n" +
                "Сортировка по условию: \nНачальный массив: ${array.contentToString()}"
    )
    val random = Random
    val isAscending = random.nextBoolean()
    println("Сортировка в порядке: ${if (isAscending) "возрастания" else "убывания"}")
    sortQuickStart(array, 0, array.lastIndex, isAscending)
    println("Конечный массив: ${array.contentToString()}")
}

fun sortQuickStart(array: Array<Int>, low: Int, high: Int, isAscending: Boolean) {
    if (low < high) {
        val partition = partition(array, low, high, isAscending)
        sortQuickStart(array, low, partition - 1, isAscending)
        sortQuickStart(array, partition, high, isAscending)
    }
}

fun partition(array: Array<Int>, low: Int, high: Int, isAscending: Boolean): Int {
    var left = low
    var right = high
    val pivot = array[low + (high - low) / 2]

    while (left <= right) {
        if (isAscending) {
            while (array[left] < pivot) {
                left++
            }
            while (array[right] > pivot) {
                right--
            }
        } else {
            while (array[left] > pivot) {
                left++
            }
            while (array[right] < pivot) {
                right--
            }
        }
        if (left <= right) {
            val temp = array[left]
            array[left] = array[right]
            array[right] = temp
            left++
            right--
        }
    }
    return left
}

/*Напишите функцию, которая удаляет все дубликаты из массива и возвращает
отсортированный массив.*/

fun deleteDuplicate() {
    val array = arrayOf(4, 2, 2, 8, 5, 6, 8, 5)
    val newArray = mutableListOf<Int>()
    println(
        "----------------------------------\n" +
                "Начальный массив: ${array.contentToString()}"
    )
    sortQuickStart(array, 0, array.lastIndex)

    for (i in array.indices) {
        if (i == 0 || array[i] != array[i - 1]) {
            newArray.add(array[i])
        }
    }
    println("Конечный массив: $newArray")
}

/*Отсортируйте массив, чтобы отрицательные числа находились перед
положительными, *сохраняя порядок внутри каждой группы.*/

fun sortNegativeNumbers() {
    var j = 0
    var buff = 0
    val array = arrayOf(4, -3, 2, -1, 0, -5)
    println(
        "----------------------------------\n" +
                "Начальный массив: ${array.contentToString()}"
    )
    for (i in 0..array.lastIndex) {
        if (array[i] < 0) {
            buff = array[i]
            array[i] = array[j]
            array[j] = buff
            j++
        }
    }

    for (i in 0..array.lastIndex - 1) {
        if ((i < j - 1) && (array[i] < array[j])) {
            buff = array[i]
            array[i] = array[i + 1]
            array[i + 1] = buff
        } else if (array[i] > array[i + 1]) {
            buff = array[i]
            array[i] = array[i + 1]
            array[i + 1] = buff
        }
    }
    println("Конечный массив: ${array.contentToString()}")
}

/*Напишите функцию, которая сортирует массив по частоте появления элементов (по убыванию).
Если два элемента встречаются одинаковое количество раз, сортируйте их по
возрастанию.*/

fun sortArrayByFrequency() {
    val array = mutableListOf(4, 5, 6, 5, 4, 3, 7)
    println(
        "----------------------------------\n" +
                "Начальный массив: $array"
    )
    var index = 0

    var max = Int.MIN_VALUE
    for (num in array) {
        if (num > max) {
            max = num
        }
    }

    val frequency = IntArray(max + 1)

    for (num in array) {
        frequency[num]++
    }

    for (i in array.indices) {
        for (j in 0 until (array.size - 1 - i)) {
            if (frequency[array[j]] < frequency[array[j + 1]] ||
                (frequency[array[j]] == frequency[array[j + 1]] && array[j] > array[j + 1])
            ) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }

    for (i in array.indices) {
        if (frequency[array[i]] > 1) {
            index = i
        }
    }

    for (i in index + 1..array.lastIndex) {
        for (j in index + 1..array.lastIndex - i + index) {
            if (array[j] < array[j + 1]) {
                val buff = array[j]
                array[j] = array[j + 1]
                array[j + 1] = buff
            }
        }
    }

    println("Конечный массив: $array")
}

/*Напишите функцию, которая возвращает минимальное количество перестановок,
необходимых для сортировки массива.*/

fun minValueOfRearrangement() {
    val array = arrayOf(10, 7, 8, 9, 1, 5)
    var minValue = 0
    var minIndex = 0
    var countOfRearrangement = 0
    println(
        "----------------------------------\n" +
                "Сортировка выбором: \nНачальный массив: ${array.contentToString()}"
    )
    for (i in 0 until array.lastIndex) {
        minIndex = i
        for (j in (i + 1)..array.lastIndex) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }

        if (minIndex != i) {
            minValue = array[minIndex]
            array[minIndex] = array[i]
            array[i] = minValue
            countOfRearrangement++
            println("Перестановка : [${array[minIndex]}, ${array[i]}]")
        }
    }
    println("Конечный массив: ${array.contentToString()}")
    println("Минимальное количество перестановок для сортировки: $countOfRearrangement")
}