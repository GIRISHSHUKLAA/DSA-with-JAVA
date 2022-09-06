public class prime {
    public static void main(String[] args) {
        int n1 = 40;
        for (int i = 2; i <= n1; i++) {
            System.out.println(i + " " + isPrime(i));
        }
//        optimized way:-Sieve of Eratosthenes
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
    }

    //    initially all the elements in an array are false
//    False in array means number is prime
    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
//                if a number is prime means its multiple is not prime so make it true
                for (int j = 2 * i; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!primes[i]){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int n) {
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
}
