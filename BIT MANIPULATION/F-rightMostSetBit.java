import java.util.Scanner;

class rightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = (int) ((Math.log10(n & -n)) / Math.log10(2)) + 1;
//      log2 will return you, the number of times we can express that number in a power of two.
//      For all binary numbers containing only the rightmost set bit as 1 like 2, 4, 8, 16, 32….
//      We will find that position of rightmost set bit is always equal to log2(Number)+1
        System.out.println(ans); // position of rightmost set bit

        System.out.println(n & (-n));  //always return the binary number containing the rightmost set bit as 1.
//       (if N = 12 (1100) then it will return 4 (100))


    }
}
