import java.io.ObjectOutputStream.PutField;
import java.util.ArrayDeque;
import java.util.Stack;

/**
 * PreviousGreater
 */
public class PreviousGreater {

    public static void main(String[] args) {
        int[] arr = { 15, 10, 18, 12, 4, 6, 2, 8 };
        int n = arr.length;
        printGreater(arr, n);
        System.out.println();
        printGreater1(arr, n);
    }

    public static void printGreater(int[] arr, int n) {
        // Naive Solution
        // Time Complexity:-O(n^2)
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1) {
                System.out.print("-1" + " ");
            }
        }
        System.out.println();
    }

    public static void printGreater1(int[] arr, int n) {
        // Naive Solution
        // Time Complexity:-O(n)
        // Space Complexity:-O(n)
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
                s.pop();
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.print(pg + " ");
            s.add(arr[i]);
        }
    }
}
