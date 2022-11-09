import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 5, -6, 6, 2, 2};
        System.out.println(longestSubarray(arr, arr.length, 4));
        System.out.println(longestSubarray2(arr, arr.length, 4));

    }

    static int longestSubarray(int[] arr, int n, int sum) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < n; j++) {
                s = s + arr[j];
                if (s == sum) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }


    static int longestSubarray2(int[] arr, int n, int sum) {
//        Optimized Solution
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int pre_sum = 0, ans = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {

            // accumulate pre_sum
            pre_sum += arr[i];

            // when subarray starts from index '0'
            if (pre_sum == sum)
                ans = i + 1;

            // make an entry for 'pre_sum' if it is
            // not present in 'map'
            if (!map.containsKey(pre_sum)) {
                map.put(pre_sum, i);
            }

            // check if 'pre_sum-k' is present in 'map'
            // or not
            if (map.containsKey(pre_sum - sum)) {

                // update maxLength
                if (ans < (i - map.get(pre_sum - sum)))
                    ans = i - map.get(pre_sum - sum);
            }
        }

        return ans;

    }
}
