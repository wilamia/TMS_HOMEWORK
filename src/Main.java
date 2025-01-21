import java.util.Scanner;

public class Main {

     /*Напишите программу, которая принимает строку и переставляет слова в обратном
    порядке, используя только методы String и StringBuilder.*/

    public static void reverseWords() {

        Scanner scn = new Scanner(System.in);
        StringBuilder currentWord = new StringBuilder();
        StringBuilder reversedWord = new StringBuilder();

        String message = scn.nextLine();

        while (true) {
            if (message.contains(" ")) {
                int index = message.indexOf(" ");
                currentWord.append(message, 0, index);
                reversedWord.insert(0, currentWord + " ");
                message = message.substring(index + 1).trim();
                currentWord.setLength(0);
            } else {
                reversedWord.insert(0, message + " ").reverse();
                break;
            }
        }
        System.out.println(reversedWord);
    }

    /*Реализуйте программу, которая преобразует строку в последовательность ASCII￾
    кодов и строку кодов в текст, используя циклы и методы String.*/

    public static void shiftAscii() {
        Scanner scn = new Scanner(System.in);
        String message = scn.nextLine();
        StringBuilder asciiMessage = new StringBuilder();
        String[] asciiCodes = message.split(" ");
        StringBuilder decodedMessage = new StringBuilder();
        char[] symbols = message.toCharArray();
        if (isAsciiCodes(message)) {
            for (String code : asciiCodes) {
                int asciiCode = Integer.parseInt(code);
                decodedMessage.append((char) asciiCode);
            }
            System.out.println(decodedMessage);
        } else {
            for (char symbol : symbols) {
                asciiMessage.append((int) symbol + " ");
            }
            System.out.println(asciiMessage);
        }
    }

    public static boolean isAsciiCodes(String input) {
        String[] parts = input.split(" ");
        for (String part : parts) {
            if (!part.matches("\\d+")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        reverseWords();
        shiftAscii();
    }
}
