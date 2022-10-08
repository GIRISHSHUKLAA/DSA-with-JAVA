public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm1(7, 3));
        System.out.println(lcm2(7, 3));
    }

    static int lcm1(int a, int b) {
//        Time Complexity:-O(a*b-max(a,b))
        int ans = Math.max(a, b);
        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                return ans;
            } else {
                ans++;
            }
        }
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }


// a * b = gcd(a,b) * lcm (a,b)
    static int lcm2(int a, int b) {
//      Time complexity:- O(log(min(a,b))
        return a * b / gcd(a, b);
    }
}
