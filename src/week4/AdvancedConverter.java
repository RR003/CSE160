package week4;

import java.util.Scanner;

public class AdvancedConverter {
    public static double poundsToKilos(double pounds) {
        return pounds * 0.4535;
    }
    public static double kilosToPounds(double kilos) {
        return kilos * 2.2046;
    }
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.6214;
    }
    public static double milesToKilometers(double miles) {
        return miles * 1.6093;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose one of the following options: \n" +
                    "A - convert pounds to kilos\n" +
                    "B - convert kilos to pounds\n" +
                    "C - convert kilometers to miles\n" +
                    "D - convert miles to kilometers\n" +
                    "E - Exit");
            String string = scanner.next().toLowerCase();

            if (string.equals("e")) break;
            else if (string.equals("a")) {
                System.out.println("Type in the number of pounds");
                double pounds = scanner.nextDouble();
                System.out.println(pounds + " pounds is " + poundsToKilos(pounds) + " kilos");
            }else if (string.equals("b")) {
                System.out.println("Type in the number of kilos");
                double kilos = scanner.nextDouble();
                System.out.println(kilos + " kilos is " + kilosToPounds(kilos) + " pounds");
            }else if (string.equals("c")) {
                System.out.println("Type in the number of kilometers");
                double kilometers = scanner.nextDouble();
                System.out.println(kilometers + " kilometers is " + kilometersToMiles(kilometers) + " miles");
            }else if (string.equals("d")) {
                System.out.println("Type in the number of miles");
                double miles = scanner.nextDouble();
                System.out.println(miles + " miles is " + milesToKilometers(miles) + " kilomiles");
            }else System.out.println("type a letter between A - E please");
            System.out.println();
        }

    }
}
