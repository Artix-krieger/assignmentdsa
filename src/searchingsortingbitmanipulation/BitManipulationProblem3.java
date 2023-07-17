package searchingsortingbitmanipulation;


public class BitManipulationProblem3 {
    public static void checkEvenOdd(int x) {
        if ((x & 1) == 0) System.out.println("Even");
        else if ((x & 1) == 1) System.out.println("Odd");
    }

    public static void main(String[] args) {
        int n1 = 45;
        int n2 = 72;
        checkEvenOdd(n1);
        checkEvenOdd(n2);
    }
}
