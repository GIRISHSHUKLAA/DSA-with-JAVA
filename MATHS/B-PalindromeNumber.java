public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palind(4554));

    }

    static boolean palind(int n) {
//        Time Complexity:- O(N)
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp = temp / 10;
        }
        return (n == rev);
    }
}
