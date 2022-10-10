//A simple approach to this problem is to first create a mask
//We can achieve this by shifting 1 k times to left or by doing (1<<k).
//We want to get 3rd bit of 1000001. 1<< 3 will give us 1000. and then and it with 1.

import java.util.Scanner;

class GH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //number for which you have to find the ith bit
        int k = sc.nextInt();    //position for which u want to find the ith bit
        int ans = (1 << k) & n;  //This will give ans in decimal form
        int ans1 = (n >> k) & 1; //This will give ans in the form of 0 and 1
        System.out.println(ans);
        System.out.println(ans1);
    }
}
