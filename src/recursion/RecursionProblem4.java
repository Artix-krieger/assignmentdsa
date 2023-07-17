package recursion;

import java.util.Arrays;

public class RecursionProblem4 {
    public static int sumOfAllElements(int[] arr, int idx, int sum) {
        if (idx == arr.length) return sum;
        sum += arr[idx];
        return sumOfAllElements(arr, idx + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        int res = sumOfAllElements(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of All Elements in the Array: " + res);
    }
}
