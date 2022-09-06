public class imPerfectSqrt {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;  // till how many decimal do you want your answer
        System.out.println(sqrt(n, precision));
        System.out.printf("%.4f", sqrt(n, precision));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n)
                root += incr;
            root -= incr;
            incr /= 10;
        }
//        if while loop condition becomes false then we have to go back one step

        return root;
    }
}


//6.3239999999999945
