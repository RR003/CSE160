package week5;

import java.util.Arrays;
import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Type in a number");
            int number = scanner.nextInt();

            if (!isNumberInArray(array, number, counter)) {
                array[counter] = number;
                counter++;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("counter " + counter);
        printArray(array, counter);
    }

    public static boolean isNumberInArray(int[] array, int n, int size) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == n) result = true;
        }
        return result;
    }

    public static void printArray(int[] array, int size) {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
           if (i == size - 1)System.out.print(array[i] + "]");
           else System.out.print(array[i] + ", ");
        }
    }
}
