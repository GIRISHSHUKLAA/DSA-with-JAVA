public class recursion {
    public static void main(String[] args) {
        int n = factorial(10);
        System.out.println(n);
    }
// Not a tail recursive 
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else {

            return n * factorial(n - 1);
        }
    }
    
//     TAIL RECURSIVE 
    
        static int factorial2(int n, int k) {
        if (n == 1)
            return k;
        else {
            return factorial2(n - 1, n * k);
        }
    }
}
