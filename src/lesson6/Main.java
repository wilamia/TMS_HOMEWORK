package lesson6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sortStrings();
    }

    public static void sortStrings() {
        String[] strings = {"date", "cherry", "banana", "apple"};
        String temp;
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(strings));
    }
}
