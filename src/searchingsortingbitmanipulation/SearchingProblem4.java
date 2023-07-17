package searchingsortingbitmanipulation;

public class SearchingProblem4 {

    public static int countOccurrence(int[] arr, int target) {
        int count = 0;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                int high = arr.length - 1;
                int index = 0;
                while (arr[high] != target) {
                    high--;
                    index = high;
                }
                count = index - mid + 1;
                break;

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (count == 0) {
            System.out.println("Element not found in the array");
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        int[] arr2 = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target2 = 6;
        int result = countOccurrence(arr, target); // time complexity -> O (log n + k) | space complexity -> O(1)
        System.out.println("The count of " + target + " is: " + result);
        int result2 = countOccurrence(arr2, target2);
        System.out.println("The count of " + target2 + " is: " + result2);
    }
}
