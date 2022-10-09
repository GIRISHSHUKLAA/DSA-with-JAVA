public class TrailingZero {
    public static void main(String[] args) {
        System.out.println(countZero1(10));
        System.out.println(countZero2(1000));
    }

    static int countZero1(int n) {
//        Time Complexity:- O(N)
//        Auxiliary Space:- O(1)
//        The major issue with the solution is it is going to cause overflow even for slightly higher values of n
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int c = 0;
        while (fact % 10 == 0) {
            c++;
            fact = fact / 10;
        }
        return c;
    }

    static int countZero2(int n) {
        /*
        * Time Complexity:- O(log n)
        *                                Efficient Method:-
        * The idea is to count how many 2's and 5's we have in the prime factorization of the given factorial
        * so if u have a number and u want to count the trailing zero's
        *
        * write prime factorization of that number and if u count how many 2's and 5's it has and consider both
        * 2 and 5 as pair then u can count how many trailing zeros it has because 2 and 5 together form a trailing
        * zeros
        * The number of 5 is going to less than number of 2 so i simply need to count how many 5 i have in
        * prime factorization
        *
        * Trailing zeros count:-n/5 + n/25 + n/125 + ...............+n/i (take floor value of n/i)
        */


        int r=0;
        for (int i = 5; i <=n; i*=5) {
            r=r+n/5;
        }
        return r;
    }
}
