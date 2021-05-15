package week5;

import java.util.Scanner;

public class sumsOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimensions of an n x m matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter row " + (i + 1));
            for (int j = 0; j < cols; j++) {
                if (i == 0) matrix[i][j] = scanner.nextInt();
                else matrix[i][j] = scanner.nextInt() + matrix[i - 1][j];

                if (i == rows - 1) System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
