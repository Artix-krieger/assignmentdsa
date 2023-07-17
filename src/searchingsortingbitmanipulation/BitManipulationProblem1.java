package searchingsortingbitmanipulation;

public class BitManipulationProblem1 {

    static int printBinary(int n) {
        int x = 1;
        int ans = 0;

        while (x <= n) {
            x *= 2;
        }
        x /= 2;
        while (x > 0) {
            int lastDigit = n / x;
            n -= lastDigit * x;
            x /= 2;
            ans = ans * 10 + lastDigit;
        }
        return ans;
    }


    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int ans1 = printBinary(n1);
        int ans2 = printBinary(n2);
        System.out.println(n1 + " can be represented as: " + ans1);
        System.out.println(n2 + " can be represented as: " + ans2);
    }
}
