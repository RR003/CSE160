package week2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.print("Enter your meal cost: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        double tip = 0;
        if (number <= 30) tip = 5.00;
        else tip = number * 0.15;

        tip = Math.round(tip * 100.0) / 100.0;


        double result = tip + number;
        result = Math.round(result * 100.0) / 100.0;

        System.out.println("The gratuity is: " + tip + ", and the total is: " + result);
    }
}
