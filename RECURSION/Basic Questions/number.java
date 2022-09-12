public class recursion {
    public static void main(String[] args) {
        number(5);
    }
    static void number(int n){
        if(n==0)
            return;
         number(n-1);
        System.out.println(n);
    }
}
