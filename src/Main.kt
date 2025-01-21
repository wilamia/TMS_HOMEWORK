/*Напишите программу, которая принимает строку и переставляет слова в обратном
порядке, используя только методы String и StringBuilder.*/

fun reverseWord() {
    val message = readln()
    val reversedWords = message.split(" ").reversed().joinToString(" ")
    println(reversedWords.reversed())
}

/*Реализуйте программу, которая преобразует строку в последовательность ASCII￾
кодов и строку кодов в текст, используя циклы и методы String.*/

fun asciiCode() {
    val message = readln()
    if (message.all { it.isDigit() || it.isWhitespace() }) {
        val asciiCodes = message.split(" ")
        val decodedMessage = StringBuilder()

        for (code in asciiCodes) {
            val asciiCode = code.toInt()
            decodedMessage.append(asciiCode.toChar())
        }
        println(decodedMessage)
    } else {
        for (char in message) {
            print("${char.toInt()} ")
        }
    }

}

fun main() {
    reverseWord()
    asciiCode()
}