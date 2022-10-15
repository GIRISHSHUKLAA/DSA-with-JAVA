public class sum {
    public static void main(String[] args) {
        int n = sum(1342);
        System.out.println(n);
    }

    static int sum(int n) {
        if (n == 0)
            return 0;
        else {
            return n % 10 + sum(n / 10);
        }
    }
}

// Time Complexity:- O(n)
// Auxiliary Space:- O(n)
