package searchingsortingbitmanipulation;

import java.util.Arrays;

public class SearchingProblem2 {
    // last occurrence
    public static int findLastOccurrence(int[] arr, int target) {
        int idx = -1;
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                idx = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int target = 4;

        System.out.println(Arrays.toString(arr));

        int result = findLastOccurrence(arr, target);

        if (result != -1) {
            System.out.println("The last occurrence of element " + target + " is located at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
