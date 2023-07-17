package searchingsortingbitmanipulation;

import java.util.Arrays;

public class SearchingProblem3 {

    public static int countOne(int[] arr) {
        int result = -1;
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                result = end - mid + 1;
                break;
            } else if (arr[mid] == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int result = countOne(arr);
        if (result == 0) {
            System.out.println("There is not a single one present in the array");
            System.out.println("Just look at the array");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("The count of One in the array is: " + result);
            System.out.println("You're correct Perfect Judgement, just look at the array");
            System.out.println(Arrays.toString(arr));
        }
    }
}
