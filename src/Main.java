import java.util.Scanner;

public class Main {

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер задания: ");
        int task = scanner.nextInt();
        switch (task){
            case 1:
                tasksOneTwo();
                break;
            case 2:
                tasksThreeFour();
                break;
            case 3:
                taskFiveVariant1();
                break;
            case 4:
                taskFiveVariant2();
                break;
            case 5:
                findPerimeterAndArea();
                break;
            case 6:
                calculateMark();
                break;
            case 7:
                printMultiplicationTable();
                break;
            case 8:
                fibonacci();
                break;
            default: System.out.println("Такого задания нет :(");
        }
    }

    private static void tasksOneTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        System.out.println("Сумма чисел: " + (numOne+numTwo));

        if (numOne % 2 == 0 && numTwo % 2 == 0) {
            System.out.println("Оба числа являются четными");
        } else if (numOne % 2 == 0) {
            System.out.println("Первое число является четным");
        } else if(numTwo % 2 == 0) {
            System.out.println("Второе число является четным");
        } else {
            System.out.println("Ни одно число не является четным");
        }
    }

    private static void tasksThreeFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int num = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (num > 0) {
            System.out.println(i);
            i+=1;
            sum+=num;
            num--;
        }
        System.out.println("Сумма чисел от 1 до " + (i-1) + " = " + sum);

    }

    private static void taskFiveVariant1() {
        boolean isPositive = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        while (isPositive){
            int num = scanner.nextInt();
            if (num >= 0) {
                System.out.println("Число " + num);
            } else {
                isPositive = false;
                System.out.println("Введено отрицательное число, программа завершена");
            }
        }
    }

    private static void taskFiveVariant2() {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        do{
            num = scanner.nextInt();
            System.out.println("Число " + num);
        }
        while (num>=0);
    }

    private static void findPerimeterAndArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину и ширину прямоугольника: ");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println("Периметр прямоугольника: " + ((width+height) * 2));
        System.out.println("Площадь прямоугольника: " + (width * height));
    }

    private static void calculateMark() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите баллы студента: ");

        int mark = scanner.nextInt();

        if (mark >=90){
            System.out.println("Оценка А");
        } else if (mark >= 75){
            System.out.println("Оценка B");
        } else if (mark >= 50){
            System.out.println("Оценка С");
        } else if (mark >= 30){
            System.out.println("Оценка D");
        } else{
            System.out.println("Оценка F");
        }
    }

    private static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int secondNumber = 1;

        while ((secondNumber) <= (number+1)){
            System.out.println(number + " * " + secondNumber + " = " + number*secondNumber);
            secondNumber++;
        }
    }

    private static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа последовательности: ");
        int num = scanner.nextInt();
        int result = fibonacciVariant2(num);
        System.out.println(result);
        fibonacciVariant1(num);
    }

    private static void fibonacciVariant1(int number) {
        int counter = 2;
        int firstNumber = 0;
        int secondNumber = 1;
        int num = 0;
        while (counter<=number) {
            num = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = num;
            counter++;
        }
        System.out.println(num);
    }

    private static int fibonacciVariant2(int number) {
        if (number<=1) {
            return number;
        }
        return fibonacciVariant2(number-2) + fibonacciVariant2(number-1);
    }

}