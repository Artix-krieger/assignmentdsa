package arrayandmatrix;

public class ArrayProblem3 {
    static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // test case 1
        int[] arr1 = {34, 21, 54, 65, 43};
        int result1 = maxElement(arr1);
        System.out.println("Max element: " + result1); // 65
        // test case 2
        int[] arr2 = {4, 3, 6, 7, 1};
        int result2 = maxElement(arr2);
        System.out.println("Max element: " + result2); // 7

    }
}
