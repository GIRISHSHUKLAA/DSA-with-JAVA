public class PrimeFactor {
    public static void main(String[] args) {
        primeFactor1(12);
        System.out.println();
        primeFactor2(12);
        System.out.println();
        primeFactor3(12);
    }

    //    Time Complexity:- O(n^2 log(n))
    static void primeFactor1(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }

    static boolean isPrime(int n) {
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

    /*
     *                           EFFICIENT SOLUTION:-
     * Divisors always appear in pairs
     *
     * A number n can be written as multiplication power of prime factors
     * 12= 2^2 * 3
     *
     */

    static void primeFactor2(int n) {
        if (n < 1) {
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.print(n + " ");
        }
    }

    //    More Optimized solution
    static void primeFactor3(int n) {
//        Time Complexity:- O(squrt(N)
        if (n <= 1) {
            return;
        }
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
           while (n%i==0){
               System.out.print(i);
               n=n/i;
           }
           while (n%(i+2)==0){
               System.out.println(i+2+" ");
               n=n/(i+2);
           }
           if (n>3){
               System.out.println(n);
           }
        }
    }

}
