package week2;

import java.util.Scanner;

public class AdvancedChangeMaker {
    public static void main(String[] args) {
        int change, rem, twenty, ten, five, one, qs, ds, ns, ps;
        System.out.print("Input change amount in dollars: ");
        Scanner input = new Scanner(System.in);

        double amount = input.nextDouble() * 100;
        // System.out.println(amount);

        twenty =(int) amount / 2000;
        rem = (int)amount % 2000;

        ten = rem / 1000;
        rem =  rem % 1000;

        five =  rem / 500;
        rem =  rem % 500;

        one = rem / 100;
        rem = rem % 100;

        qs = rem / 25;
        rem = rem % 25;

        ds = rem / 10;
        rem = rem % 10;

        ns = rem / 5;
        rem = rem % 5;

        ps = rem;

        System.out.println(twenty + " $20 bills, " + ten + " $10 bills, " + five + " $5 bills, " + one + " $1 bills, " +
                            qs + " quarters, " + ds + " dimes, " + ns + " nickles, " + ps + " pennies.");
    }
}
