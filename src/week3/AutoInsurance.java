package week3;

import java.util.Scanner;

public class AutoInsurance {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is the base cost of the auto insurance company?");
        double base = scanner1.nextDouble();
        System.out.println("What is your age?");
        int age = scanner1.nextInt();
        System.out.println("What is your gender? (male or female)");
        String gender = scanner1.next();
        gender = gender.toLowerCase();

        double percent = 0;
        if (age >= 18 && age < 21 && gender.equals("male")) percent = 1;
        else if (age >= 18 && age < 21 && gender.equals("female")) percent = 0.9;
        else if (age >= 21 && age < 30) percent = 0.75;
        else if (age >= 30 && age < 60 && gender.equals("male")) percent = 0.6;
        else if (age >= 30 && age < 60 && gender.equals("female")) percent = 0.7;
        else if (age > 60) percent = 1;
        else percent = -1;

        if (percent == -1) System.out.println(-1);
        else System.out.println(base * percent);
    }
}
