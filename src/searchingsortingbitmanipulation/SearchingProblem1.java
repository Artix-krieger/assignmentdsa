package searchingsortingbitmanipulation;

import java.util.Scanner;

public class SearchingProblem1 {

    static void linearSearch(int[] arr, int key) {
        int n = arr.length;
        int idx;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                idx = i;
                System.out.println("Element is present the array at index: " + idx);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Element doesn't exist in the array" + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Now enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Given array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Now enter the element to be searched in array: ");
        int k = sc.nextInt();

        linearSearch(arr, k);


    }
}
