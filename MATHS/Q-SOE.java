import java.util.Arrays;

public class prime {
    public static void main(String[] args) {
        int n = 40;
        printPrime(n);
        System.out.println();
        sieve(n);
        System.out.println();
        sieve1(n);
    }

    static void printPrime(int n) {
//        Time Complexity:- O(n * root n)
//        n for this loop and root n for isPrime
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }



    /*
     *                           Optimized way:-Sieve of Eratosthenes
     * Idea:- Create a boolean array of size [n+1]
     * We initialize this array as true at the end the entries which are prime will remain true and else become false
     * if a number is prime means its multiple is not prime so make it false
     *
     */

    static void sieve(int n) {
//        Simple implementation of sieve algorithm
//        Time complexity:- O(N*log(log N))
        if (n <= 1) {
            return;
        }

        boolean isPrime[] = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
//                    Instead of 2i you can also use i*i
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }

//    shorter implementation of optimized sieve

    static void sieve1(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
