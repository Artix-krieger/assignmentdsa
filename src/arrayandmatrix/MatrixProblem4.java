package arrayandmatrix;

public class MatrixProblem4 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length, n= arr[0].length;
        int i, j;

        int maximum = Integer.MIN_VALUE;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (maximum < arr[i][j]) maximum = arr[i][j];
            }
        }
        System.out.println("The maximum element in this matrix is : " + maximum);
    }

}
