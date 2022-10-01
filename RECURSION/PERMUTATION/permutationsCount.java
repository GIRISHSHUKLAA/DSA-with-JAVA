public class Permutation {
    public static void main(String[] args) {
        System.out.println( permutationsCount("abdc", ""));
    }

    static int permutationsCount(String str, String ans) {
        if (str.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            count = count +permutationsCount(str.substring(1), first + ch + second);
        }
        return count;
    }
}
