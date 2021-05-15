package week1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Retail Price: ");
        Scanner inputs = new Scanner(System.in);
        int price = inputs.nextInt();

        System.out.print("How many items are you buying: ");
        Scanner input = new Scanner(System.in);
        int numOfItems = input.nextInt();

        double discount = 0;
        if (numOfItems >= 10 && numOfItems <= 19) discount = 0.8;
        else if (numOfItems >= 20 && numOfItems <= 49) discount = 0.7;
        else if (numOfItems >= 50 && numOfItems <= 99) discount = 0.6;
        else if (numOfItems >= 100) discount = 0.5;

        double result = (price * discount) * numOfItems;
        System.out.println("Total price: " + result);
    }
}
