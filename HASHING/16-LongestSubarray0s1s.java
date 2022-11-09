import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(longestSubarray0sAnd1s(arr, arr.length));
        System.out.println(longestSubarray0sAnd1s2(arr, arr.length));

    }

    static int longestSubarray0sAnd1s(int[] arr, int n) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)
        int ans = 0;
        for (int i = 0; i < n; i++) {
//            Outer loop consider every element as beginning element of a subarray
            int c0 = 0, c1 = 0;
            for (int j = i; j < n; j++) {
//                used to get the ending element
                if (arr[j] == 0)
                    c0++;
                else {
                    c1++;
                }
                if (c0 == c1) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }


    static int longestSubarray0sAnd1s2(int[] arr, int n) {
//        Optimized Solution
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                maxLen = i + 1;

            if (hm.containsKey(sum + n)) {
                if (maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);

            } else hm.put(sum + n, i);
        }
        return maxLen;
    }
}

