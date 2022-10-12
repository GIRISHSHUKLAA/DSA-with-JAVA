// Swapping of two numbers using bitwise operator
// Eg: a = 4 (100 in binary), b = 6 (110 in binary)
// ans :- a = 6 and b = 4.
public class swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        a = a ^ b; //  (a = 4 ^ 6)
        b = a ^ b; //  (b = 4 ^ 6 ^ 6) [xor of same numbers is 0, hence b = 4 (since 6 ^ 6= 0) ]
        a = a ^ b; //  (a = 4 ^ 6 ^ 4= 6)
        System.out.println(a+","+b);
    }
}
