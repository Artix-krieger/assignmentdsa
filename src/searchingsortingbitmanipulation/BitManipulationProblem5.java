package searchingsortingbitmanipulation;

public class BitManipulationProblem5 {
    public static int getOddOccurrence(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int res = getOddOccurrence(arr);
        System.out.println(res);
    }
}
