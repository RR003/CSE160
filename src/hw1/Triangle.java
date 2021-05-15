package hw1;// Rahul Raja
// 113126572
// rahul.raja@stonybrook.edu

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1");
        int side1 = scanner.nextInt();
        System.out.println("Enter side 2");
        int side2 = scanner.nextInt();
        System.out.println("Enter side 3");
        int side3 = scanner.nextInt();

        boolean isRealTriangle = false;

        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) isRealTriangle = true;
        /*if (side1 < side2) {
            if (side1 < side3) {
                if (side2 < side3) {
                    if (side1 + side2 <= side3) isRealTriangle = false;
                }else {
                    if (side1 + side3 <= side2) isRealTriangle = false;
                }
            }else{
                if (side1 + side3 <= side2) isRealTriangle = false;
            }
        }else {
            if (side2 < side3) {
                if (side1 < side3) {
                    if (side1 + side2 <= side3) isRealTriangle = false;
                }else {
                    if (side3 + side2 <= side1) isRealTriangle = false;
                }
            }else {
                if (side3 + side2 <= side1) isRealTriangle = false;
            }
        }*/

        String result = "";
        if (isRealTriangle) {
            if (side1 == side2) {
                if (side2 == side3) result = "equilateral";
                else result = "isosceles";
            }else {
                if (side1 == side3 || side2 == side3) result ="isoceles";
                else result = "scalene";
            }
        }else result = "Invalid input!";

        System.out.println(result);
    }
}
