import java.util.*;

public class MaximumSubbarrays {
    public static void main(String[] args) {
        int[] arr = {10, 8, 5, 12, 15, 7, 6};
        printSubarray(arr, 3, 7);
        System.out.println();
        printSubarray2(arr, 3, 7);
    }


    static void printSubarray(int[] arr, int k, int n) {
//        Naive Solution
//        Time Complexity:-O(n^2)
        for (int i = 0; i < n - k + 1; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max + " ");
        }
    }

    static void printSubarray2(int[] arr, int k, int n) {
//        Efficient Approach
//        Time Complexity:-O(n)
        Deque<Integer> dq = new ArrayDeque<>();


        for (int i = 0; i < k; ++i) {

            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();


            dq.addLast(i);
        }


        for (int i = k; i < n; ++i) {

            System.out.print(arr[dq.peek()] + " ");


            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();


            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();


            dq.addLast(i);
        }


        System.out.print(arr[dq.peek()]);
    }
}
