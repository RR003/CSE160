package week1;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        System.out.print("Enter a degree in Celcius: ");
        Scanner input = new Scanner(System.in);
        int celcius = input.nextInt();
        double result = ((9.0 / 5) * celcius) + 32;
        System.out.println(celcius + " in Celsius is " + result + " in Fahrenheit");
    }
}
