import java.util.Scanner;

class GH{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//number for which you have to find the ith bit
        int k=sc.nextInt();//positon for which u want to find the ith bit
        System.out.println((n>>(k-1))&1);
    }
}
