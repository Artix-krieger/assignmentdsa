package array;

public class Problem1 {
    static int sumEvenIndex(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = sumEvenIndex(arr); // 1 + 3 + 5 + 7 + 9
        System.out.println(result); // 25
        // test case 1
        int[] arr1 = {3, 20, 4, 6, 9};
        int result1 = sumEvenIndex(arr1); // 3 + 4 + 9
        System.out.println(result1); // 16
        // test case 2
        int[] arr2 = {4, 3, 6, 7, 1};
        int result2 = sumEvenIndex(arr2); // 4 + 6 + 1
        System.out.println(result2); // 11
    }
}
