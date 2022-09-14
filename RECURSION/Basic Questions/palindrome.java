public class palindrome {
    public static void main(String[] args) {
        System.out.println(palind(1));
    }

    static int reverse(int n) {
//     sometimes you might need some additional variables in the argument in that case take another function
        int digit = (int) (Math.log10(n)) + 1;
        return (helper(n, digit));
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    static boolean palind(int n) {
        return n==reverse(n);
    }

}
