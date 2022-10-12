public class TwoOddOccurring {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};
        int n = 10;
        ans(arr, n);
    }

    static void ans(int[] arr, int n) {
        int xor = 0;
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        int sn = xor & (~(xor - 1));  // right most set bit in xor
//        in sn u will get a number whose only set bit is the last set bit of original Xor
        for (int i = 0; i < n; i++) {
            if ((arr[i] & sn) != 0) {
//               DO xor of all the number which have this (sn) bit set
                res1 = res1 ^ arr[i];
            } else {
//          and dO xor of all the number which do not have this (sn) bit set
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1+" "+res2);

    }
}

