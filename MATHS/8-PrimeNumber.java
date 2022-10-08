public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime1(7));
        System.out.println(isPrime2(7));


    }

    static boolean isPrime1(int n) {
//        Time Complexity:- O(N)
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //   Optimized approach
    static boolean isPrime2(int n) {
//        Time Complexity:- O(sqrt(N))
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    More efficient solution
    /*
     * Idea:- BY checking n % 2 == 0 and n % 3 == 0 , we can save many iteration for larger n
     */
    static boolean isPrime3(int n) {
//        It is 3 times faster than isPrime2
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i < n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
