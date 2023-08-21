import java.util.TreeSet;

public class CelingLeft {
    public static void main(String[] args) {
        int[] arr = {2, 8, 30, 15, 25, 12};
        int n = arr.length;

//        printCeiling1(arr, n);
        printCeiling2(arr, n);
    }

    private static void printCeiling1(int[] arr, int n) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Aux. Space:- O(1)
        System.out.print("-1" + " ");
        for (int i = 1; i < n; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    diff = Math.min(diff, arr[j] - arr[i]);
                }
            }
            if (diff == Integer.MAX_VALUE)
                System.out.print("-1" + " ");
            else System.out.print((arr[i] + diff) + " ");
        }
    }

    private static void printCeiling2(int[] arr, int n) {
//        Efficient Solution
//        Time Complexity:- O(n logn)

        System.out.print("-1" + " ");
        TreeSet<Integer> t = new TreeSet<>();
        t.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (t.ceiling(arr[i]) != null) {
                System.out.print(t.ceiling(arr[i]) + " ");
            } else System.out.print("-1" + " ");
            t.add(arr[i]);
        }
    }
}
