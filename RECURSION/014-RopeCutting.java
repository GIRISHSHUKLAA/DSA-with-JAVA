public class RopeCutting {
    public static void main(String[] args) {
        int n = 9;
        int a = 2;
        int b = 2;
        int c = 2;
        System.out.println(ropeCut(n, a, b, c));
    }

    static int ropeCut(int n, int a, int b, int c) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        int ans = Math.max(ropeCut(n - a, a, b, c), ropeCut(n - b, a, b, c));
        ans = Math.max(ans, ropeCut(n - c, a, b, c));
        if (ans == -1) {
            return -1;
        }
        return ans + 1;
    }
}
// Time Complexity:- O(3^n)
// can be optimized using Dynamic Programming
