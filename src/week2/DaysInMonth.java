package week2;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner input1 = new Scanner(System.in);
        int year  = input1.nextInt();

        System.out.print("Enter a month: ");
        Scanner input2 = new Scanner(System.in);
        int month = input2.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug",
                            "Sep", "Oct", "Nov", "Dec"};

        int result = 0;
        if (month == 2 && (year % 4== 0) ) {
            if (year % 100 == 0 && year % 400 != 0) result = days[1];
            else result = days[1] + 1;
        }else {
            result = days[month - 1];
        }

        System.out.println(months[month - 1] + " " + year + " has " + result + " days.");
    }
}
