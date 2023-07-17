package searchingsortingbitmanipulation;

public class BitManipulationProblem2 {
    public static boolean isPowerOfTwo(int x) {
        if (x == 0) return false;
        if (x == Integer.MIN_VALUE) return false;
        return (x & x - 1) == 0;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = -2147483648;
        boolean res1 = isPowerOfTwo(n1);
        boolean res2 = isPowerOfTwo(n2);
        System.out.println(n1 + " is this a power of two: " + res1);
        System.out.println(n2 + " is this a power of two: " + res2);
    }
}
