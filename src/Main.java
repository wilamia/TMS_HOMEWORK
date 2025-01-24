import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        searchMaxMinValue();
        countEvenOddNumbers();
        reverseArray();
        isPalindrome();

    }

    /*Напишите программу, которая находит и выводит максимальное и минимальное
    значение в массиве целых чисел. Также вычислите индекс этих элементов.
    */

    public static void searchMaxMinValue() {
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = 0;
        int minValue = Integer.MAX_VALUE;
        int minValueIndex = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-5, 5);
        }

        System.out.println("Массив чисел: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            if (maxValue < array[i]) {
                maxValue = array[i];
                maxValueIndex = i;
            } else if (minValue > array[i]) {
                minValue = array[i];
                minValueIndex = i;
            }
        }

        System.out.println();
        if (maxValue == 0 && minValue == 0) {
            return;
        } else {
            System.out.println("Минимальное значение: " + minValue + "\nИндекс элемента: " + minValueIndex);
            System.out.println("Максимальное значение: " + maxValue + "\nИндекс элемента: " + maxValueIndex);
        }
    }

    /*Напишите программу, которая принимает массив целых чисел и подсчитывает,
сколько четных и сколько нечетных чисел в нем содержится*/

    public static void countEvenOddNumbers() {
        Random random = new Random();
        int evenNumbers = 0;
        int oddNumbers = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 15);
        }

        System.out.println("Массив чисел: ");
        for (int value: array) {
            System.out.print(value + " ");

            if (value%2==0) {
                evenNumbers+=1;
            } else {
                oddNumbers+=1;
            }
        }

        System.out.println();
        if(oddNumbers == 0 && evenNumbers == 0){
            return;
        }
        else {
            System.out.println("Количество четных чисел: " + evenNumbers +
                    "\nКоличество нечетных чисел: " + oddNumbers);
        }
    }

    /*Напишите программу, которая принимает массив целых чисел и изменяет его порядок
на обратный. Выведите результат после изменения порядка.*/

    public static void reverseArray() {
        Random random = new Random();
        int valueFirstHalf = 0;
        int valueSecondHalf = 0;
        int[] array = new int[11];
        int counter = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 20);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nПеревернутый массив: ");
        for (int i = 0; i < array.length / 2; i++) {
            valueFirstHalf = array[i];
            valueSecondHalf = array[counter];
            array[i] = valueSecondHalf;
            array[counter] = valueFirstHalf;
            counter--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*Напишите программу, которая проверяет,
является ли массив чисел палиндромом*/

    public static void isPalindrome() {
        Scanner scn = new Scanner(System.in);
        int valueFirstHalf = 0;
        int valueSecondHalf = 0;
        int[] array = new int[6];
        int counter = array.length - 1;
        boolean isPalindrome = true;

        System.out.println("Введите " + array.length + " чисел массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        for (int value: array) {
            System.out.print(value + " ");
        }

        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            valueFirstHalf = array[i];
            valueSecondHalf = array[counter];
            if(valueFirstHalf != valueSecondHalf) {
                isPalindrome = false;
                break;
            }
            counter--;
        }

        if(isPalindrome) {
            System.out.println("Массив является палиндромом");
        } else {
            System.out.println("Массив не является палиндромом");
        }
    }
}
