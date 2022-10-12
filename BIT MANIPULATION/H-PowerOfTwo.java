public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(128));
        System.out.println(isPowerOfTwo2(128));
        System.out.println(isPowerOfTwo3(128));
        System.out.println(isPowerOfTwo4(128));


    }

    static boolean isPowerOfTwo1(int x) {
//      Time complexity of this code is O(logN).
//      function will return true if x is a power of 2, otherwise false.
        if (x == 0)
            return false;
        else {
            while (x % 2 == 0) x /= 2;
            return (x == 1);
        }
    }

    static boolean isPowerOfTwo2(int x) {
        /*
         *                Brian Kernighan's Algorithm: Used to count the number of set a bit in a integer
         *  Interesting fact:- If a number is a power of two it has only one set bit
         * Time Complexity:O(Set bit count)
         */
        int count = 0;
        while (x > 0) {
            count += x & 1;
            x >>= 1;
        }
        return count == 1;
    }


    static boolean isPowerOfTwo3(int x) {
        /*
         * If number is a power of two than it has only one set  bit
         * Unset the only set bit ans if your result become zero than number is a power of 2
         * How to unset a right most set bit:--> do bit wise and of that number with n-1 (n is your number)
         */
        if (x == 0) {
            return false;
        }
        return ((x & (x - 1)) == 0);
    }

    // one line expression of above code
    static boolean isPowerOfTwo4(int x) {
        return (x != 0) && ((x & (x - 1)) == 0);
    }


}

