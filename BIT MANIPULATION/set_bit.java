// set means turn it to 1 
// if ith bit is zero turn it to 1
// if it bit is 1 remain it 1 only 
import java.util.Scanner;

class setBit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//number for which you have to find the ith bit
        int k=sc.nextInt();//positon for which u want to find the ith bit
        int ans=(n>>(k-1))&1;
        if (ans==0){
            ans=1;
        }
        
        System.out.println(ans);
    }
}
