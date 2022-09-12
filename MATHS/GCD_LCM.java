public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
        System.out.println(lcm(2,7));
    }

    static int gcd(int a, int b) {

        if (a == 0)
            return b;
        return gcd(b % a, a); //if u keep going like this onr time a will become zero
//        what is the gcd 0f 0 and 300--->300
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
