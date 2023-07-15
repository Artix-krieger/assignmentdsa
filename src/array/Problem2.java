package array;

public class Problem2 {
    static void evenIndex(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenIndex(arr); // 2 4 6 8 10
        int[] arr1 = {34,21,54,65,43};
        evenIndex(arr1); // 34 54
        int[] arr2 = {4,3,6,7,1};
        evenIndex(arr2); // 4 6

    }
}
