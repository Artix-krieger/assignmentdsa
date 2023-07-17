package recursion;

public class RecursionProblem2 {

    public static int sumOfNNaturalNoWithAlternateSign(int num) {
        if (num==0) return 0;
        return num + sumOfNNaturalNoWithAlternateSign(num-1);
    }

    public static void main(String[] args) {
        int num = 10;
        int alternateSum = sumOfNNaturalNoWithAlternateSign(num);
        System.out.println("Sum: " + alternateSum);
    }
}
