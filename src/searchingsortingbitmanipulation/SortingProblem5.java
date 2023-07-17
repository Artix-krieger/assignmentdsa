package searchingsortingbitmanipulation;

public class SortingProblem5 {
    public static int selectionSortMinItrToDescending(int[] arr) {
        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
                iterations++;
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return iterations;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 0};
        int res = selectionSortMinItrToDescending(arr);
        System.out.println(res);
    }
}
