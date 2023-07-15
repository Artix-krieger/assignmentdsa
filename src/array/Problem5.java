package array;

public class Problem5 {
    static int firstPeakElement(int[] arr) {
        int element = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                element = arr[i];
                break;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        // test case 1
        int[] arr1 = {1, 3, 2, 6, 5};
        int result1 = firstPeakElement(arr1);
        System.out.println(result1); // 3
        // test case 2
        int[] arr2 = {1, 4, 7, 3, 2, 6, 5};
        int result2 = firstPeakElement(arr2);
        System.out.println(result2); // 7

    }
}
