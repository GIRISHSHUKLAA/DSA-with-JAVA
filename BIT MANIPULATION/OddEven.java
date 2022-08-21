public class OddEven {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(isEven(n));
    }

    private static boolean isEven(int n) {
        return (n & 1) != 1;
    }
}
