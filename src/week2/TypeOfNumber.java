package week2;

import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        Long number = input.nextLong();
        String result = "";

        if (number >= -128 && number <= 127) result = "byte";
        else if (number >= -32768 && number <= 32767) result = "short";
        else if (number >= -2147483648 && number <= 2147483647) result = "int";
        else if (number >= -9223372036854775808L && number <= 9223372036854775807L) result = "long";

        System.out.println(result);

        
    }
}
