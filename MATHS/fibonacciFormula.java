public class fibo {
    public static void main(String[] args) {
        System.out.println(fiboFormula(100));
    }

    static int fiboFormula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n)  / Math.sqrt(5));
    }
}
