package arrayandmatrix;

public class MatrixProblem5 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        int mid = m/2;

        System.out.println("The elements  of the middle row and middle column are as follows : ");

        for (int[] a : arr) {
            System.out.print(a[mid] + "  ");
        }
        for (int i = 0; i < m; i++) {
            if (i == mid) continue;
            System.out.print(arr[mid][i] + "  ");
        }

    }
}
