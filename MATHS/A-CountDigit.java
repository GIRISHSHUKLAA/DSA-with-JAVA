public class Count {
    public static void main(String[] args) {
        System.out.println(countDigit(546));

        int digit = (int) (Math.log10(1421) + 1); // direct formula to find number of digit in a number
        System.out.println(digit);
    }

    static int countDigit(int n) {
//        Time Complexity:- O(N)
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
}
