package recursion;

import java.util.Arrays;

public class RecursionProblem3 {

    public static int maxElement(int[] arr, int index, int max) {
        if (index == arr.length) return max;
        else if (arr[index] > max) max = arr[index];
        return maxElement(arr, index + 1, max);
    }


    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 2, 5};
        int max = maxElement(arr, 0, Integer.MIN_VALUE);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max Element In the Array: " + max);
    }
}
