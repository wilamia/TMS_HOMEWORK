import java.util.Scanner;

public class Main {

    /* Написать программу, которая
    проверяет является ли число палиндромом */
    public static void isPalindrome() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String numbersStr = String.valueOf(number);

        // variant 1
        String reverseNumber = new StringBuilder(numbersStr).reverse().toString();
        boolean isPalindrome = numbersStr.equals(reverseNumber);

        // variant 2
        boolean isTrue = true;
        char[] symbols = numbersStr.toCharArray();

        for (int i = 0; i< symbols.length; i++){
            if (symbols[symbols.length - (i+1)] == symbols[i]){
                isTrue = true;
            } else {
                isTrue = false;
            }
        }
        // result
        if (isPalindrome || isTrue){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number isn't palindrome");
        }
    }

    /* Определить является ли число простым */
    public static void isSimple() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean isSimple = true; // для проверки деления

        for (int i = 2; i < number; i++) {
            /* начинаем с 2, так как все числа делятся на 1
            и строго < так как длина и есть само число */
            if (number % i == 0 || number <= 0){
                /* проверяем есть ли остаток после деления либо на
                отрицательность числа и 0, так как 0 не простое число*/
                isSimple = false;
                break;
            }
        }
        // result
        if (isSimple){
            System.out.println("Number is simple");
        } else {
            System.out.println("Number isn't simple");
        }
    }

    /* Вычислить сумму цифр числа до единичного разряда */
    public static void calculateSum() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Sum of digits: " + reduceToSingleDigit(number));
    }
    private static int reduceToSingleDigit(int num) {
        if (num < 10) {
            return num;
        }

        return reduceToSingleDigit((num % 10) + reduceToSingleDigit(num/10));
    }

    /* Вывеcти перевернутую лесенку высотой n */
    public static void reverseStairs () {
        System.out.println("Enter number of stairs: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStairs, count;

        for (numberOfStairs=scanner.nextInt(); numberOfStairs > 0; numberOfStairs--) {
            for (count = numberOfStairs; count > 0; count--)
                System.out.print('#');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of task: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        switch (number) {
            case 1: isPalindrome();
                break;
            case 2: isSimple();
                break;
            case 3: calculateSum();
                break;
            case 4: reverseStairs();
                break;
            default: System.out.println("Выход из программы");
        }
    }
}
