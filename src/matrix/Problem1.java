package matrix;

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input m and n from user
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        // Take m*n integer inputs from user and store in a matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter an integer: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        // Initialize counters for each category
        int num_pos = 0;
        int num_neg = 0;
        int num_odd = 0;
        int num_even = 0;
        int num_zero = 0;

        // Iterate over each element in matrix and update counters
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) {
                    num_pos++;
                } else if (matrix[i][j] < 0) {
                    num_neg++;
                } else {
                    num_zero++;
                }
                if (matrix[i][j] % 2 == 0) {
                    num_even++;
                } else {
                    num_odd++;
                }
            }
        }

        // Print out the count of each category
        System.out.println("Number of positive numbers: " + num_pos);
        System.out.println("Number of negative numbers: " + num_neg);
        System.out.println("Number of odd numbers: " + num_odd);
        System.out.println("Number of even numbers: " + num_even);
        System.out.println("Number of zeros: " + num_zero);

        sc.close();
    }
}
