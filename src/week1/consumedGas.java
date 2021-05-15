package week1;

import java.util.Scanner;

public class consumedGas {
    public static void main(String[] args) {
        System.out.println("Length of time driven (in minutes): ");
        Scanner inputs = new Scanner(System.in);
        double minutes = inputs.nextDouble();

        System.out.print("Constant speed of the car (mph): ");
        Scanner input = new Scanner(System.in);
        double mph = input.nextDouble();

        System.out.print("Fuel Efficiency (mpg): ");
        Scanner inputss = new Scanner(System.in);
        double mpg = inputss.nextDouble();


        double result = (minutes / 60) * mph * (1/mpg);

        System.out.println(result);
    }
}
