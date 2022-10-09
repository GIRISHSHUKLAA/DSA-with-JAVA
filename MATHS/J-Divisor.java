public class Divisor {
    public static void main(String[] args) {
        divisor1(12);
        System.out.println();
        divisor2(12);
        System.out.println();
        divisor3(12);
        System.out.println();
    }

    static void divisor1(int n) {
//        Time Complexity:- O(N)
//        Auxiliary Space:- O(1)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }


    //    Efficient Solution
    /*
     * Divisors always lies in pairs
     *
     * One of the divisors in every pair is < or = square root of n
     *
     * The below implementation will not print the result in sorted order
     */
    static void divisor2(int n) {
//        Time Complexity:- O(sqrt(N))
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            if (i != n / i) {
//             This condition means that in case of perfect square like 25
//             you will print 5, but you don't want to print it 2 times for those cases we have that if condition
                System.out.print(n / i + " ");
            }
        }
    }


    //    The below implementation is the extension of divisor2 and this will print the result in sorted order
    static void divisor3(int n) {
//        Time Complexity:- O(sqrt(N))
        int i = 0;
        for (i = 1; i * i <= n; i++) {
//            This for loop will print all divisor from 1 (inclusive) to root n (exclusive)
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for (; i >= 1; i--) {
//           This for loop will print all divisor from root n (inclusive) to  n (exclusive)

            if (n % i == 0) {
                System.out.print(n / i + " ");
            }
        }
    }
}
