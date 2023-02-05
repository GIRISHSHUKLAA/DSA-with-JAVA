import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// import javax.swing.text.AbstractDocument.BranchElement;

/**
 * NextGreater
 */
public class NextGreater {

    public static void main(String[] args) {
        int[] arr = { 5, 15, 10, 8, 6, 12, 9, 18 };
        int n = arr.length;
        printGreater(arr, n);
        System.out.println();
        System.out.println(printGreater1(arr, n));
    }

    public static void printGreater(int[] arr, int n) {
        // Naive Solution
        // Time Complexity:-O(n^2)
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j >= n) {
                System.out.print("-1" + " ");
            }
        }
    }

    public static ArrayList<Integer> printGreater1(int[] arr, int n) {
        // Effiecient Solution
        // Time Complexity:-O(n)
        // Space Complexity:-O(n)
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[n - 1]);
        list.add(-1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i]) {
                st.pop();
            }
            int nextGreater = (st.isEmpty()) ? (-1) : st.peek();
            list.add(nextGreater);
            st.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

}
