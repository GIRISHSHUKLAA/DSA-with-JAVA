public class subset {
    public static void main(String[] args) {
        int N = 3;
        char[] A = {'A', 'B', 'C'};
        for (int i = 0; i < (1 << N); i++) {
            for (int j = 0; j < N; j++)
                if ((i & (1 << j)) != 0)
                    System.out.print(A[j] + " ");
            System.out.println();
        }
        printPowerSet("abc");
    }
    static void printPowerSet(String str) {
            int n =str.length();
            int powerSize=(int)Math.pow(2,n);
        for (int i = 0; i < powerSize; i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0){ // checking corresponding bit is set or not
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
//    Time Complexity:- O(2^n * n)
//     there are 2^N possible subsets of any given set with N elements.
//     Eg:-   Consider a set A of 3 elements.A = {a, b, c}
//        0 = (000)2 = {}
//        1 = (001)2 = {c}
//        2 = (010)2 = {b}
//        3 = (011)2 = {b, c}
//        4 = (100)2 = {a}
//        5 = (101)2 = {a, c}
//        6 = (110)2 = {a, b}
//        7 = (111)2 = {a, b, c}
}
