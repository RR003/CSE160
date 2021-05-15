package week3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreYouAFan {
    public static void main(String[] args) {
        System.out.println("Welcome to the NFL Quiz, this will week14.test how well you know the NFL");
        int result = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Q1. How many teams are there in each division in the NFL (Please enter a integer): ");
        int response1 = scanner1.nextInt();
        if (response1 == 8) {
            System.out.println("This is correct!");
            result++;
        }
        else System.out.println("Sorry, the correct answer was 8");
        System.out.println();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Q2. What team does Russel Wilson play for? a) Patriots b) Steelers c) 49ers d) Seahawks e) Falcons (Please enter a character a-e)");
        String response2 = scanner2.nextLine();
        if (response2.equals("d")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was the Seahawks");

        System.out.println();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Q3. How many wins did the Pittsburgh Steelers have in the 2020 season (Please enter a integer)");
        int response3 = scanner3.nextInt();
        if (response3 == 12) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was 12 wins");

        System.out.println();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Q4. Who was the leading receiver in the 2020 season? a) Hopkins b) Diggs c) Hill d) Metcalf e) Justin Jefferson (Please enter a character a-e)");
        String response4 = scanner4.nextLine();
        if (response4.equals("b")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was Stefon Diggs");

        System.out.println();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Q5. True or False: Jared Goff was the starting QB in the Seahawks Playoff game (true or false): ");
        String response5 = scanner5.nextLine();
        response5.toLowerCase();
        if (response5.equals("false")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was false");

        System.out.println();
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Q6. Who led the league in sacks in the 2020 season: a) Cam Jordan b) Aaron Donald c) JJ Watt d) TJ Watt e) Shaq Barrett (Please enter a character a-e)");
        String response6 = scanner6.nextLine();
        if (response6.equals("d")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was TJ Watt");

        System.out.println();
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Q7. On what day was the Steelers Ravens week 12 game played? a) Thursday b) Sunday c) Monday c) Tuesday e) Wednesday (Please enter a character a-e)");
        String response7 = scanner7.nextLine();
        if (response7.equals("e")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was Wednesday");

        System.out.println();
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Q8. True or False, the Steelers finished the last six games with only one win and failed to win the division (true or false)");
        String response8 = scanner8.nextLine();
        response8.toLowerCase();
        if (response8.equals("false")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the correct answer was false, the steelers did win the division");

        System.out.println();
        Scanner scanner9 = new Scanner(System.in);
        System.out.println("True or false, the Bucs had more wins after their bye week (Week 13) than before it? (true or false)");
        String response9 = scanner9.nextLine();
        response9.toLowerCase();
        if (response9.equals("true")) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the answer was true.");

        System.out.println();
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("How many different Starting QBs were there for the NFC East");
        int response10 = scanner10.nextInt();

        if (response10 == 11) {
            System.out.println("This is correct!");
            result++;
        }else System.out.println("Sorry, the answer was 11.");

        System.out.println();
        System.out.println("You got " + result + " questions right");
        if (result > 8) System.out.println("Wow, you really watched the 2020 NFL Season");
        else if (result > 5) System.out.println("You are a casual fan I see");
        else System.out.println("Do you even watch football");
    }
}
