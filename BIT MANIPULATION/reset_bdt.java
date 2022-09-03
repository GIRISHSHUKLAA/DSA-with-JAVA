// RESET MEANS:-
//             if it is 1 make it 0
//             if it is 0 remain it zero

//      Let’s say we have 1001101, and we want to clear it’s, 3rd bit. So 1 << 3 will give us 1000, but we
//      want something like 1110111. What can we do ??
//      Let’s try out by taking negation of our mask. So ~(mask) = ~(1000) = ~(0001000) = 1110111
//      Now perform ‘&’ operation of number & mask to clear the 3rd bit.
import java.util.Scanner;

class GH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //number for which you have to reset the kth bit
        int k = sc.nextInt();    //position on which u want to reset the bit
        int ans = ~((1 << k)) & n;
        System.out.println(ans);
//      If you want ans, in binary form use Integer.toBinaryString(ans) function;
        System.out.println(Integer.toBinaryString(ans));

    }
}
