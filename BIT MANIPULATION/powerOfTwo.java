
public class powerOfTwo {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(isPowerOfTwo(x));
        System.out.println(isPowerOfTwoBit(x));
    }

    static boolean isPowerOfTwo(int x) {
//      Time complexity of this code is O(logN).
//      function will return true if x is a power of 2, otherwise false.
        if (x == 0)
            return false;
        else {
            while (x % 2 == 0) x /= 2;
            return (x == 1);
        }
    }

//  using bit-wise operator
    static boolean isPowerOfTwoBit(int x) {
        // x will check if x == 0 and !(x & (x - 1)) will check if x is a power of 2 or not
        int ans = (x & (x - 1));
        if (ans == 0 && x!=0)
            return true;
        else
            return false;
    }
}
