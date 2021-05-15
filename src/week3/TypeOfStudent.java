package week3;

import java.util.Scanner;

public class TypeOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many credits are you taking this semester: ");

        int credits = scanner.nextInt();

        if (credits > 12) System.out.println("You are a full-time student");
        else if (credits >= 1) System.out.println("You are a part-time student");
        else System.out.println("Incorrect number of credits");
    }
}
