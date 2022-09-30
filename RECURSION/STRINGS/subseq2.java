import java.util.ArrayList;

public class subseq2 {
    public static void main(String[] args) {
        String ans = "";
        System.out.println(subseq("abc", ans));
    }

    static ArrayList<String> subseq(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = subseq(str.substring(1), ans + ch);
        ArrayList<String> right = subseq(str.substring(1), ans);
        left.addAll(right);
        return left;
    }
}
