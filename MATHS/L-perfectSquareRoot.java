public class perfectSquareRoot {
    public static void main(String[] args) {
        int n = 100;
        int s = 0;
        int e = n;
        int ans = 0;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (ans == 0)
            System.out.println("Not a perfect square");
        else
            System.out.println(ans);
    }
}
