package lesson4;

import java.util.Scanner;

public class Main {

    public static void toUpperCase(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char symbol = message.charAt(i);
            if (symbol >= 'a' && symbol <= 'z') {
                sb.append((char) ((int) symbol - 32));
            }
        }
        System.out.println(sb.toString());
    }

    public static void ifContains() {
        Scanner scn = new Scanner(System.in);
        String message = scn.nextLine();
        if (message.contains(" ")) {
            System.out.println("Строка содержит пробел");
        } else {
            System.out.println("Строка не содержит пробел");
        }
    }

    public static void toASCIICode() {
        Scanner scn = new Scanner(System.in);
        char symbol = scn.next().charAt(0);
        int asciiCode = (int) symbol;
        System.out.println(asciiCode);

    }

    private static void buildString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Java").append(" ").append("is").append(" ").append("fun");
        System.out.println(sb.toString());
    }

    private static void replace() {
        String message = "Убрать пробелы";
        System.out.println(message.replace(" ", ""));
    }

    public static void main(String[] args) {
//        toUpperCase("в верхний регистр");
//        ifContains();
//        toASCIICode();
//        buildString();
//        replace();
    }
}
