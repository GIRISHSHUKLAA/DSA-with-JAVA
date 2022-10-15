public class reverse_number {
    public static void main(String[] args) {
//        method1(4532);
//        System.out.println(sum);
        System.out.println(method2(23456));
    }

    static int sum = 0;

    static void method1(int n) {
        if (n == 0)
            return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        method1(n / 10);

    }

    static int method2(int n) {
//     sometimes you might need some additional variables in the argument in that case take another function
        int digit = (int) (Math.log10(n)) + 1;
        return (helper(n, digit));
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digit - 1)) + helper(n / 10, digit - 1);
    }

}
