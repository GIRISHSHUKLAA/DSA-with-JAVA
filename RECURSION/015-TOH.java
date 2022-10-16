public class TOH {
    public static void main(String[] args) {
        int n = 3;
        char A = 'A';
        char B = 'B';
        char C = 'C';
        toh(n, A, B, C);
    }

    static void toh(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        toh(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        toh(n - 1, B, A, C);
    }
}

// Number of movements for given n= (2^n)-1; for n=3 ans=7
// Time Complexity:- 2^n
