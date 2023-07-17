package recursion;

public class RecursionProblem1 {
    public static int sumOfDigit(int num) {
        if (num >= 0 && num <= 9) return num;
        return sumOfDigit(num / 10) + num % 10;
    }

    public static void main(String[] args) {
        int num = 12347;
        int res = sumOfDigit(num);
        System.out.println("Sum of digit " + num + " is -> " + res);
    }
}
