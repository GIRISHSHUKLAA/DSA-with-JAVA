/*
 * In decimal to binary we keep the number dividing by two and keep storing the remainder
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        fun(13);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        } else {
            fun(n / 2);
            System.out.print(n % 2);
        }
    }
}
