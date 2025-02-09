package tasks_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bookClass();
        isWinter();
        findTargetSum();
        replaceZeroToEnd();
        isAnagram();
        sumOfSubArray();
        multiplyOfSubArray();
    }

    /* Реализуйте класс Book, который будет иметь следующие свойства:
    • Название книги (title)
    • Автор книги (author)
    • Год издания (year)
    Добавьте методы:
    • Конструктор для инициализации этих полей.
    • Метод для вывода информации о книге в виде строки.
    • Переопределите метод equals, чтобы книги с одинаковыми названиями и авторами
    считались равными.*/
    public static void bookClass() {
        Book book = new Book("War and Peace", new Author("Leo Tolstoy", 1828), 1869);
        Book newBook = new Book("War and Peace", new Author("Leo Tolstoy", 1828), 1869);
        book.printInfo();
        System.out.println(book.equals(newBook));
    }

    /*Создайте перечисление Month, которое будет содержать все 12 месяцев. Добавьте
    метод isWinter() для определения зимних месяцев (декабрь, январь, февраль).*/

    public static void isWinter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Напишите название месяца: ");
        String inputMonth = scn.nextLine();
        for (Month month : Month.values()) {
            if (month.value.equals(inputMonth) || month.name().toLowerCase().equals(inputMonth)) {
                month.isWinter(month.name());
                return;
            }
        }
        System.out.println("Некорректное название месяца.");
    }

    /*Дан массив целых чисел и число targetSum. Найдите все пары чисел, сумма которых равна
    targetSum.*/
    public static void findTargetSum() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите необходимую сумму: ");
        int targetSum = scn.nextInt();
        ArrayList<Integer> firstNum = new ArrayList<>();
        for (int i = 0; i <= targetSum / 2; i++) {
            for (int j = targetSum; j > 0; j--) {
                if (i + j == targetSum) {
                    firstNum.add(i);
                    firstNum.add(j);
                }
            }
        }
        for (int i = 0; i < firstNum.size(); i++) {
            System.out.print("Комбинация чисел: " + firstNum.get(i) + " ");
            i++;
            System.out.println(firstNum.get(i));
        }
    }

    /*Напишите метод, который перемещает все нули в конец массива, сохраняя порядок
    остальных элементов.*/
    public static void replaceZeroToEnd() {
        int[] a = new int[]{0, 2, 3, 4, 1, 9, 0, 6, 4, 0, 7};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                for (int k = i; k < a.length - 1; k++) {
                    int h = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = h;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }

    /*Напишите метод, который проверяет, являются ли два массива перестановками друг друга (то
    есть содержат одинаковые элементы в разном порядке).*/
    public static void isAnagram() {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{4, 3, 2, 1};
        int j = b.length - 1;
        boolean isAnagram = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[j]) {
                isAnagram = true;
            } else {
                isAnagram = false;
                break;
            }
            j--;
        }
        if (isAnagram) {
            System.out.print("Анаграммы");
        } else {
            System.out.print("Не анаграммы");
        }
    }

    /*Дан массив целых чисел и число k. Найдите максимальную сумму подмассива длины k.*/
    public static void sumOfSubArray() {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[]{6, 2, 23, 12, 4};
        System.out.println("Введите число: ");
        int k = scn.nextInt(), sum = 0, j = 0, maxSum = 0, count = k;

        while (k > a.length) {
            System.out.println("Число превышает длину массива");
            k = scn.nextInt();
            count = k;
        }

        do {
            for (int i = j; i <= count - 1; i++) {
                sum += a[i];
            }
            if (sum > maxSum)
                maxSum = sum;
            sum = 0;
            j++;
            count++;
        } while (count <= a.length);
        System.out.print("Максимальная сумма подмассива длины " + k + " : " + maxSum);
    }

    /*Дан массив целых чисел (может содержать как положительные, так и отрицательные
    значения). Найдите максимальное произведение подмассива (подряд идущих элементов).*/
    public static void multiplyOfSubArray() {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[]{-1, 2, -3, 7, -4};
        System.out.println("Введите число: ");
        int k = scn.nextInt(), multiply = 1, j = 0, maxMultiply = Integer.MIN_VALUE, count = k;

        while (k > a.length) {
            System.out.println("Число превышает длину массива");
            k = scn.nextInt();
            count = k;
        }

        do {
            for (int i = j; i <= count - 1; i++) {
                multiply *= a[i];
            }
            System.out.println(multiply);
            if (multiply > maxMultiply)
                maxMultiply = multiply;
            multiply = 1;
            j++;
            count++;
        } while (count <= a.length);
        System.out.print("Максимальное произведение подмассива длины " + k + " : " + maxMultiply);
    }
}

