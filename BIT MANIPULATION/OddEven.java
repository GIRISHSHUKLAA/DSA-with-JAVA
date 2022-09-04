public class OddEven {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(isEven(n));
    }

    private static boolean isEven(int n) {
        return (n & 1) != 1;
//         if (n & 1)==1 than number is odd if (n & 1)==0 than number is even 
    }
}
