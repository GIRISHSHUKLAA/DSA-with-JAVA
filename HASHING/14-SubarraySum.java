import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 13, 3, -1};
        System.out.println(isSubarray(arr, arr.length, 22));
        System.out.println(isSubarray2(arr, arr.length, 22));

    }

    static boolean isSubarray(int[] arr, int n, int sum) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i + 1; j < n; j++) {
                s = s + arr[j];
                if (s == sum) {
                    return true;
                }
            }
        }
        return false;
    }


    static boolean isSubarray2(int[] arr, int n, int sum) {
//        Naive Solution
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0; // used to calculate prefix sum
        for (int i = 0; i < n; i++) {
            pre_sum = pre_sum + arr[i];
            if (h.contains(pre_sum - sum)) {
                return true;
            }
            if (pre_sum == sum)
                return true;
            h.add(pre_sum);
        }
        return false;
    }
}
