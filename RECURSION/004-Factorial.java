public class recursion {
    public static void main(String[] args) {
        int n = factorial(10);
        System.out.println(n);
    }

    static int factorial(int n) {
        if (n == 1)
            return 1;
        else {

            return n * factorial(n - 1);
        }
    }
}
