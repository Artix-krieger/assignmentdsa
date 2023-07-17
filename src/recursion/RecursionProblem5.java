package recursion;

public class RecursionProblem5 {
    public static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int sum = 0;
        int remainder;
        int digits = countDigits(n);

        while (n > 0) {
            remainder = n % 10;
            sum += Math.pow(remainder, digits);
            n /= 10;
        }
        return originalNumber == sum;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 153;
        boolean res = isArmstrongNumber(n);
        System.out.println(n + " is a Armstrong Number: " + res);
    }
}
