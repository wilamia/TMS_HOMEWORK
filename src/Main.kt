fun main() {
    println( "Для выхода из программы введите отрицательное число\n"+
            "Введите номер задания: ")
    val num = readln().toInt()
    when (num) {
        in 1..2 -> tasksOneTwo()
        in 3..4 -> taskThreeFour()
        5 -> taskFive()
        6 -> calculatePerimeterAndArea()
        7 -> mark()
        8 -> table()
        9 -> fibonacci()
        10 -> printString()
        11 -> printNumbers ()
        12 -> {
            println("Введите что-либо")
            val userInput = readln()
            val anyInformation: Any = when {
                userInput.toIntOrNull() != null -> userInput.toInt()
                userInput.toDoubleOrNull() != null -> userInput.toDouble()
                else -> userInput
            }
            anyPrint(anyInformation)
        }
        else -> println("Такого задания не существует")
    }
}

fun tasksOneTwo() {
    println("Введите два числа: ")
    val numOne = readln().toInt()
    val numTwo = readln().toInt()

    println("Сумма двух чисел: ${numTwo+numOne}")
    if (numOne % 2 == 0 && numTwo % 2 == 0) {
        println("Оба числа четные")
    } else if (numOne % 2 == 0){
        println("Число один четное")
    }
    else if (numTwo % 2 == 0) {
        println("Число два четное")
    } else{
        println("Ни одно число не четное")
    }
}

fun taskThreeFour() {
    println("Введите число: ")
    var number = readln().toInt()
    var i = 1;
    var sum = 0
    while (number < 0){
        println("Число: $i")
        sum+=number
        i++
        number--
    }
    println("Сумма чисел: $sum")
}

fun taskFive() {
    println("Введите число: ")
    var number: Int
    do{
        number = readln().toInt()
        println("Число $number")
    } while(number >= 0)
}

fun calculatePerimeterAndArea() {
    val width = readln().toInt()
    val height = readln().toInt()

    println("Периметр прямоугольника: ${(width+height)*2}")
    println("Площадь прямоугольника: ${width*height}")
}

fun mark() {
    println("Введите баллы: ")
    val points = readln().toInt()
    when (points){
        in 90..100 -> println("Оценка A")
        in 75..89 -> println("Оценка B")
        in 50..74 -> println("Оценка C")
        in 30..49 -> println("Оценка D")
        in 0..29 -> println("Оценка F")
    }
}

fun table() {
    println("Введите число: ")
    var number = readln().toInt()
    var secondNumber = 1
    while (secondNumber<=number+1){
        println("$number * $secondNumber = ${number*secondNumber}")
        secondNumber++
    }
}

fun fibonacci() {
    println("Введите число: ")
    var number = readln().toInt()
    number = calculateFibonacci(number)
    println(number)
}

fun calculateFibonacci (num: Int): Int {
    if (num<=1){
        return num
    }
    return (calculateFibonacci(num-1) + calculateFibonacci(num-2))
}

fun printString () {
    var stroki: List<String?>
    stroki = listOf("автомарафон", "чаеводство", "автоматчица", "галициийский", "благоприятствовавший" )
    if (!stroki.isNullOrEmpty()){
        stroki.forEach { element ->
            val newElement = element.substring(0,10)
            println(newElement)
        }
    }
}

fun printNumbers () {
    for (num in 1..100){
        when {
            num % 3 == 0 && num % 5 == 0 -> println("FizzBuzz")
            num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("Buzz")
            else -> println(num)
        }
    }
}

fun anyPrint (any: Any) {
    when {
        (any is String) && (any.length > 5 ) -> println("Это строка")
        (any is Int) && (any >= 0) -> println("Число положительное")
        (any is Int) && (any < 0) -> println("Число отрицательное")
        (any is Double) && (any >= 0) -> println("Число положительное")
        (any is Double) && (any < 0) -> println("Число отрицательное")
        (any is Float) && (any >= 0) -> println("Число положительное")
        (any is Float) && (any < 0) -> println("Число отрицательное")
        else -> println("Неизвестный тип")
    }
}