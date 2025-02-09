package tasks_kotlin

fun main(args: Array<String>) {
    bookClass()
    findWinter()
    compareRole()
    findPair()
    removeZeroToEnd()
    isAnagram()
    sumOfSubArray()
    multiplyOfSubArray()
}

/* Реализуйте класс Book, который будет иметь следующие свойства:
• Название книги (title)
• Автор книги (author)
• Год издания (year)
Добавьте методы:
• Конструктор для инициализации этих полей.
• Метод для вывода информации о книге в виде строки.
• Переопределите метод equals, чтобы книги с одинаковыми названиями и авторами
считались равными.
*/
fun bookClass() {
    val book: Book = Book("Преступление и наказание", Author("Федор Достоевский", 44), 1866)
    val newBook: Book = Book("Преступление и наказание", Author("Федор Достоевский", 44), 1866)
    println(book.equals(newBook))
}

/*Создайте перечисление Month, которое будет содержать все 12 месяцев. Добавьте
метод isWinter() для определения зимних месяцев (декабрь, январь, февраль).
*/
fun findWinter() {
    val month = readln()
    Month.isWinter(month)
}

/* Создайте перечисление Role с тремя значениями: ADMIN, MODERATOR, USER.
Каждая роль должна иметь привилегию (например, строку, определяющую права доступа).
Переопределите метод equals для сравнения двух ролей по их привилегиям.
*/
fun compareRole() {
    val moderator: Role = Role.MODERATOR
    val admin: Role = Role.ADMIN
    val newModerator: Role = Role.MODERATOR

    println(moderator.hasSamePrivilege(admin))
    println(moderator.hasSamePrivilege(newModerator))
}

/*Дан массив целых чисел и число targetSum. Найдите все пары чисел, сумма которых равна
targetSum.
*/
fun findPair() {
    println("Enter number: ")
    val number = readln().toInt()
    var count = number
    for (firstNumber in 0..number / 2) {
        println("Pair of numbers: $firstNumber, $count")
        count--
    }
}

/*Напишите метод, который перемещает все нули в конец массива, сохраняя порядок
остальных элементов.*/

fun removeZeroToEnd() {
    val array = arrayOf(0, 1, 2, 4, 0, 12, 0, 4, 8)
    var index = 0

    for (i in array.indices) {
        if (array[i] != 0) {
            array[index] = array[i]
            index++
        }
    }

    for (i in index until array.size) {
        array[i] = 0
    }

    println(array.joinToString(", "))
}

/*Напишите метод, который проверяет, являются ли два массива перестановками друг друга (то
есть содержат одинаковые элементы в разном порядке).*/

fun isAnagram() {
    val arrayFirst = arrayOf(1, 2, 3)
    val arraySecond = arrayOf(3, 2, 1)
    if (arrayFirst.size == arraySecond.size) {
        var firstCount = arrayFirst.size - 1
        var secondCount = 0
        while (true) {
            if (arrayFirst[firstCount] != arraySecond[secondCount]) {
                println("Массивы не являются анаграммой")
                break
            }
            secondCount++
            firstCount--
            if (firstCount < 0) {
                println("Массивы являются анаграммой")
                break
            }
        }
    } else {
        println("Массивы не являются анаграммой")
    }
}

/*Дан массив целых чисел и число k. Найдите максимальную сумму подмассива длины k.*/
fun sumOfSubArray() {
    val array = arrayOf(1, 2, 3, -15, 5, 2, 1)
    println("Введите длину подмассива: ")
    var k = readln().toInt()
    while (k > array.size) {
        println("Подмассив не должен быть больше длины массива!")
        k = readln().toInt()
    }
    var sum = 0
    var maxSum = Int.MIN_VALUE

    for (i in array.indices) {
        if (k + i <= array.size) {
            sum = 0
            for (j in 0 + i until k + i) {
                sum += array[j]
            }
            println(sum)
        }
        if (sum > maxSum)
            maxSum = sum
    }
    println("Максимальная сумма подмассива: $maxSum")
}

/*Дан массив целых чисел (может содержать как положительные, так и отрицательные
значения). Найдите максимальное произведение подмассива (подряд идущих элементов).*/
fun multiplyOfSubArray() {
    val array = arrayOf(1, 2, 3, -4, 5, 2, 1)
    var k = readln().toInt()
    while (k > array.size) {
        println("Подмассив не должен быть больше длины массива!")
        k = readln().toInt()
    }
    var multiply = 1
    var maxMultiply = Int.MIN_VALUE
    for (i in array.indices - k) {
        if (k + i <= array.size) {
            multiply = 1
            for (j in 0 + i until k + i) {
                multiply *= array[j]

            }
            println(multiply)
        }
        if (multiply > maxMultiply)
            maxMultiply = multiply
    }
    println("Максимальное произведение подмассива: $maxMultiply")
}
