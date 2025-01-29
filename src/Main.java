import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 7, 8, 9, 1, 5};
        sortNumbersBubble(numbers);
        sortNumbersSelect(numbers);
        sortNumbersInsert(numbers);
        sortNumbersQuick(numbers, 0, numbers.length - 1);
        sortIfAscendingOrDescending(numbers);
        deleteDuplicate();
        sortNegativeNumbers();
        sortArrayByFrequency();
        minValueOfRearrangement(numbers);
    }

    /*Задача 1. Сортировка пузырьком*/

    public static void sortNumbersBubble(int[] numbers) {
        int temp;
        boolean isSorted = false;
        System.out.println("Начальный массив: " + Arrays.toString(numbers));
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println("Конечный массив: " + Arrays.toString(numbers));
    }

    /*Задача 1. Сортировка выбором*/

    public static void sortNumbersSelect(int[] array) {
        int minValue, minIndex;
        int j;
        System.out.println("Начальный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                minValue = array[minIndex];
                array[minIndex] = array[i];
                array[i] = minValue;
            }
            System.out.println("После итерации " + (i + 1) + ": " + Arrays.toString(array));
        }
    }

    /*Задача 1. Сортировка вставками*/

    public static void sortNumbersInsert(int[] numbers) {
        int swap;
        int j;
        System.out.println("Начальный массив: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            swap = numbers[i];
            for (j = i; j > 0 && swap < numbers[j - 1]; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = swap;
            System.out.println("После итерации " + (i + 1) + ": " + Arrays.toString(numbers));
        }
    }

    /*Задача 1. Быстрая сортировка*/
    public static void sortNumbersQuick(int[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, low, high);

            sortNumbersQuick(array, low, partition - 1);

            sortNumbersQuick(array, partition, high);

        }
    }

    public static int partition(int[] array, int low, int high) {
        int right = high;
        int left = low;
        int pivot = array[low + (high - low) / 2];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(array));
        return left;
    }

    public static void reversedBubbleSort(int[] numbers) {
        int temp;
        boolean isSorted = false;
        System.out.println("Начальный массив: " + Arrays.toString(numbers));
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    isSorted = false;
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println("Конечный массив: " + Arrays.toString(numbers));
    }

    /*Реализуйте функцию, которая принимает массив и булевое значение. Если значение
true, сортируйте массив по возрастанию, иначе по убыванию.*/

    public static void sortIfAscendingOrDescending(int[] array) {
        Random random = new Random();
        boolean isAscending = random.nextBoolean();
        if (isAscending) {
            sortNumbersBubble(array);
        } else {
            reversedBubbleSort(array);
        }
    }

    /*Напишите функцию, которая удаляет все дубликаты из массива и возвращает
отсортированный массив.*/

    public static int[] sortAndDeleteDuplicate(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        sortNumbersBubble(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                newArray[j++] = array[i];
            }
        }
        newArray = Arrays.copyOf(newArray, j);
        return newArray;
    }

    public static void deleteDuplicate() {
        int[] array = new int[]{4, 2, 2, 8, 5, 6, 8, 5};
        int[] newArray = sortAndDeleteDuplicate(array);
        System.out.println(Arrays.toString(newArray));
    }

    /*Отсортируйте массив, чтобы отрицательные числа находились перед
положительными, *сохраняя порядок внутри каждой группы.*/

    public static void sortNegativeNumbers() {
        int[] array = new int[]{4, -3, 2, -1, 0, -5};
        System.out.println("Начальный массив: " + Arrays.toString(array));
        int j = 0;
        int buff;
        //переносим отрицательные числа влево
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                buff = array[i];
                array[i] = array[j];
                array[j] = buff;
                j++;
            }
        }
        //сортируем часть с отрицательными числами
        for (int i = 0; i < j - 1; i++) {
            if (array[i] < array[i + 1]) {
                buff = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buff;
            }
        }
        // сортируем часть с положительными числами
        for (int i = j; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                buff = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buff;
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    /*Напишите функцию, которая сортирует массив по частоте появления элементов (по убыванию).
Если два элемента встречаются одинаковое количество раз, сортируйте их по
возрастанию.*/

    public static void sortArrayByFrequency() {
        int[] array = new int[]{4, 5, 6, 5, 4, 3};
        int[] tempArray = new int[array.length];
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        int[] frequency = new int[max + 1];
        for (int num : array) {
            frequency[num]++;
        }

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = 0; j < tempArray.length - 1 - i; j++) {
                if (frequency[tempArray[j]] < frequency[tempArray[j + 1]] ||
                        (frequency[tempArray[j]] == frequency[tempArray[j + 1]] && tempArray[j] > tempArray[j + 1])) {
                    int temp = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tempArray));
    }

    /*Напишите функцию, которая возвращает минимальное количество перестановок,
необходимых для сортировки массива.*/

    public static void minValueOfRearrangement(int[] array) {
        int minValue, minIndex;
        int j;
        int countOfRearrangement = 0;
        System.out.println("Начальный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                minValue = array[minIndex];
                array[minIndex] = array[i];
                array[i] = minValue;
                countOfRearrangement++;
                System.out.println("Перестановка " + "[" + array[minIndex] + ", " + array[i] + "]");
            }
        }

        System.out.println("Конечный массив: " + Arrays.toString(array));
        System.out.println("Минимальное количество перестановок для сортировки: " + countOfRearrangement);
    }
}
