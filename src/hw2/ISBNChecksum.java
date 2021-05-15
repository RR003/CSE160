package hw2;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

import java.util.Scanner;

public class ISBNChecksum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String string = scanner.nextLine();

        if (string.length() != 12) System.out.println(string + " is not a valid input.");
         // char letter from 48 - 57
        else {
            boolean isValid = true;
            int[] array = new int[12];
            for (int i = 0; i < 12; i++) {
                char letter = string.charAt(i);
                if (letter < 48 || letter > 57) {
                    isValid = false;
                    break;
                }else {
                    array[i] = Integer.parseInt(string.substring(i, i + 1));
                }
            }
            // System.out.println(Arrays.toString(array));
            if (isValid) {
                int digit = (10 - (array[0] + (3 * array[1]) + array[2] + (3 * array[3]) + array[4] + (3 * array[5]) +
                        array[6] + (3 * array[7]) + array[8] + (3 * array[9]) + array[10] + (3 * array[11])) % 10);
                if (digit == 10) digit = 0;
                System.out.println(string + digit);
            }else System.out.println(string + " is not a valid input.");
        }

    }
}
