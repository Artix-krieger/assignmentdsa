package arrayandmatrix;

import java.util.Scanner;

public class MatrixProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Element Above Secondary Diagonal: ");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                cols--;
            }
        }

        sc.close();

    }
}
