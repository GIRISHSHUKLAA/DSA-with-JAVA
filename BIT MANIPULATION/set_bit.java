// SET MEANS:-
//             if it is 0 make it 1
//             if it is 1 remain it 1
//        A simple approach to this problem is to first create a mask such that kth bit is set in it.
//        We can achieve this by shifting 1 k times to left or by doing (1<<k).
//        Eg: We have to set 3 bit of 1000001. 1<< 3 will give us 1000.
//        Now in order to set the 3rd bit ( or kth bit) we only need to perform OR operation of number and mask.
//        Therefore 1000001 | 1000 = 1001001 (having 3rd bit set)

import java.util.Scanner;

class GH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //number for which you have to set the kth bit
        int k = sc.nextInt();   //position on which u want to set the bit
        int ans = (1 << k) | n;
        System.out.println(ans);
//      If you want ans in binary form use Integer.toBinaryString(ans) function;
        System.out.println(Integer.toBinaryString(ans));

    }
}
