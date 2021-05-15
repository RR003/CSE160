package week6;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double[][] matrix = new double[3][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        String string = scanner.nextLine();
        String[] numbers = string.split(" ");
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Double.parseDouble(numbers[index]);
                index++;
            }
        }
        getTriangleArea(matrix);
    }

    public static double getTriangleArea(double[][] points) {
        if (!isColinear(points)) {
            double x1 = points[0][0];
            double x2 = points[1][0];
            double x3 = points[2][0];

            double y1 = points[0][1];
            double y2 = points[1][1];
            double y3 = points[2][1];

            double a = distance(x1, x2, y1, y2);
            double b = distance(x2, x3, y2, y3);
            double c = distance(x1, x3, y1, y3);

            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s  -c));
            return area;
        }else return 0;
    }

    public static boolean isColinear(double[][] coordinates) {
        if ((coordinates[0][0] == coordinates[1][0]) && (coordinates[1][0] == coordinates[2][0]) && (coordinates[2][0] == coordinates[0][0])
            || ((coordinates[0][1] == coordinates[1][1]) && (coordinates[1][1] == coordinates[2][1]) && (coordinates[2][1] == coordinates[0][1]))) return true;
        else return false;
    }

    public static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }


}
