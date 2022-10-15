public class sum {
    public static void main(String[] args) {
        int n = sum(5);
        System.out.println(n);
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        else {

            return n + sum(n - 1);
        }
    }
}

// Time Complexity:- O(n)
// Auxiliary Space:- O(n)
