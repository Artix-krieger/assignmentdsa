package searchingsortingbitmanipulation;

public class SearchingProblem5 {

    public static int squareRoot(int n) {
        if (n < 2) {
            return n;
        }
        int low = 0, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            int square = mid * mid;
            if (square == n) {
                return mid;
            } else if (square < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;
        int result1 = squareRoot(num1);
        int result2 = squareRoot(num2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
