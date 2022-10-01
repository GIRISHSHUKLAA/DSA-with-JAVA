import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        ans = permutationsList("abc", "");
        System.out.println(ans);
    }

    static ArrayList<String> permutationsList(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            a.addAll(permutationsList(str.substring(1), first + ch + second));
        }
        return a;

    }
}
