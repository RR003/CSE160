package hw1;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long are you traveling");
        int distance = scanner.nextInt();
        int result = 0;


        if (distance > 100) {
            int remaining = distance - 100;
            result = 150 + 100 + remaining;
            System.out.println("Total Fare: $" + result + " (50*3 + 50*2 + " + remaining + "*1)");
        }
        else if (distance > 50) {
            int remaining = distance - 50;
            result = 150 + (distance - 50)*2;
            System.out.println("Total Fare: $" + result + " (50*3 + " + remaining + "*2)");
        }
        else {
            result = distance * 3;
            System.out.println("Total Fare: $" + result + " (" + distance + "*3)");
        }


    }
}
