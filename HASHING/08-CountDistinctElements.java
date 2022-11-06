import java.util.Arrays;
import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {15, 12, 13, 12, 13, 13, 18};
        System.out.println(countDistinct(arr, arr.length));
        System.out.println(countDistinct2(arr, arr.length));
    }

    static int countDistinct(int[] arr, int n) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)
        int ans = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                ans++;
        }
        return ans;

    }

    static int countDistinct2(int[] arr, int n) {
//        Optimized Solution-->
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)

        HashSet<Integer> m = new HashSet<>();
        for (int i = 0; i < n; i++) {
            m.add(arr[i]);
        }
        return m.size();
    }

    static int countDistinct3(Integer arr) {
//        More Improved Solution-->
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)

        HashSet<Integer> m = new HashSet<>(Arrays.asList(arr));
        return m.size();
    }
}

