package searchingsortingbitmanipulation;


public class BitManipulationProblem4 {
    public static int countSetBits(int n) {
        // Implementation of Brian Kernighan’s Algorithm:
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(countSetBits(n));
        // builtin function
        System.out.println(Integer.bitCount(n));
    }
}
