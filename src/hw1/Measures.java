package hw1;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

import java.util.Scanner;

public class Measures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle: ");
        int radius = scanner.nextInt();
        double pi = Math.PI;

        System.out.printf("Circle with diameter " + 2*radius);
        System.out.printf(", a circumference of ");
        System.out.printf("%12.2f", 2 * pi * radius);
        System.out.printf(", and an area of ");
        System.out.printf("%12.2f", pi * radius* radius);





                // + " has a diameter of " + radius*2 + ", a circumference of " +
                // 2*pi*radius + ", and an area of " + pi*radius*radius);

    }
}
