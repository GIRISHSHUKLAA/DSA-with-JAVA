public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial1(3));
        System.out.println(factorial2(3));
    }

    static int factorial1(int n) {
//        ITERATIVE SOLUTION
//        Time Complexity:- O(N)
//        Auxiliary Space:- O(1)
//        for n=0 and n=1 ans = 1
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static int factorial2(int n) {
//        RECURSIVE SOLUTION
//        Time Complexity:- O(N)
//        Auxiliary Space:- O(N)
//        Also this recursive solution causes extra overhead that's why iterative solution is better
        if (n == 0)
            return 1;
        return n * factorial2(n - 1);
    }
}
