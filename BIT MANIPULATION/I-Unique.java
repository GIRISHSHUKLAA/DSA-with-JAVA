// Given an array where all number occur even times, expect one which occur odd times. Find out that integer.

public class Unique {
    public static void main(String[] args) {
        int [] arr={4,3,4,4,4,5,5};
        int n=7;
        ans1(arr,n);
        System.out.println(ans2(arr));
    }

    static void ans1(int[] arr, int n) {
//        Time Complexity: O(n^2)
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int ans2(int[] arr) {
//       Time Complexity:O(N)
//       Auxiliary Space:O(1)
        int c = 0;
        for (int n : arr) {
            c ^= n;
        }
        return c;
    }
}


