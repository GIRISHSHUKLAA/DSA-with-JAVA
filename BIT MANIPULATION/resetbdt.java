// RESET MEANS:-
//             if it is 1 make it 0
//             if it is 0 remain it zero

import java.util.Scanner;

class GH{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//number for which you have to find the ith bit
        int k=sc.nextInt();//positon for which u want to find the ith bit
        int ans=(n>>(k-1))&1;
        System.out.println(ans);
        if (ans==1){
            ans=0;
        }

        System.out.println(ans);
    }
}
