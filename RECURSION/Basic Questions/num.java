public class recursion {
    public static void main(String[] args) {
        number(5);
    }
    static void number(int n){
        if(n==0)
            return;
        System.out.println(n);
         number(n-1);
    }
}
