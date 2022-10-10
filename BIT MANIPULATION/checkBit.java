public class checkBit {
    public static void main(String[] args) {
        checkBit1(13, 3);
        checkBit2(13, 3);

    }

    static void checkBit1(int n, int k) {
//      Using left shift operator
        int ans = n & (1 << (k - 1));
        if (ans != 0) {
            System.out.println("The bit is set");
        } else {
            System.out.println("The bit is not set");
        }
    }

    static void checkBit2(int n, int k) {
//      Using right shift operator
        int ans = (n >> (k - 1)) & 1;
        if (ans != 0) {
            System.out.println("The bit is set");
        } else {
            System.out.println("The bit is not set");
        }
    }
}
