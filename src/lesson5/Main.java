package lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cube();
    }

     public static void cube() {
         Scanner scn = new Scanner(System.in);
         int counter = 1;
         int[][][] array = new int[2][2][2];
         for (int i = 0; i<array.length; i++) {
             for (int j = 0; j<array[i].length; j++) {
                 for (int k = 0; k < array [i][j].length; k++){
                     array[i][j][k] = counter;
                     counter++;
                     System.out.print(array[i][j][k] + " ");
                 }
                 System.out.println();
             }
             System.out.println();
         }

     }

    public static void sumOfMatrixNum() {
        Scanner scn = new Scanner(System.in);
        int[][] array = new int[2][5];
        int sum = 0;

        System.out.println("Введите числа массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " массив: ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scn.nextInt();
                sum += array[i][j];
            }
        }

        System.out.println("Сумма чисел массивов: " + sum);
    }

    public static void sumOfNumArray() {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;

        System.out.println("Введите " + array.length + " чисел массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
            sum += array[i];
        }

        System.out.println("Сумма чисел массива: " + sum);
    }

    public static void findSecondValue() {
        Random random = new Random();
        int[] array = new int[20];
        int firstValue = 0;
        int secondValue = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }
        if (array.length < 2) {
            System.out.println("Невозможно найти второе максимальное число, так как в массиве только одно число");
        } else {
            for (int i : array) {
                if (firstValue < i) {
                    secondValue = firstValue;
                    firstValue = i;

                } else if (secondValue < i && i != firstValue) {
                    secondValue = i;
                }
            }

            System.out.println(Arrays.toString(array));

            if (secondValue == 0 && firstValue == 0) {
                System.out.println("Невозожно найти второе максимальное число");
            } else {
                System.out.println("Максимальное число: " + firstValue);
                System.out.println("Второе максимальное число: " + secondValue);
            }
        }
    }
}
