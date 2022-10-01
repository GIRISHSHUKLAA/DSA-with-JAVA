import java.util.ArrayList;

public class subseq3 {
    public static void main(String[] args) {
        String ans = "";
        System.out.println(subseqAsciiRet("abc",ans));
    }
    static void subseqAscii(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        subseqAscii(str.substring(1), ans + ch);
        subseqAscii(str.substring(1), ans);
        subseqAscii(str.substring(1), ans + (ch + 0));
    }

    static ArrayList<String> subseqAsciiRet(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> first = subseqAsciiRet(str.substring(1), ans + ch);
        ArrayList<String> second = subseqAsciiRet(str.substring(1), ans );
        ArrayList<String> third = subseqAsciiRet(str.substring(1), ans + (ch + 0));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
