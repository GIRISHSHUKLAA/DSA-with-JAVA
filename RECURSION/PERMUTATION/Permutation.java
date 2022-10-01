public class Permutation {
    public static void main(String[] args) {
        permutations("abc", "");
    }

    static void permutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            permutations(str.substring(1), first + ch + second);
        }
    }
}
