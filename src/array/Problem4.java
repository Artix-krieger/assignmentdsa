package array;

public class Problem4 {
    static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int secondMax(int[] arr) {
        int prevMax = maxElement(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == prevMax) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return maxElement(arr);
    }

    public static void main(String[] args) {
        // test case 1
        int[] arr1 = {34, 21, 54, 65, 43};
        int result1 = secondMax(arr1);
        System.out.println(result1);
        // test case 2
        int[] arr2 = {4, 3, 6, 7, 1};
        int result2 = secondMax(arr2);
        System.out.println(result2);

    }
}
