public class subseq {
    public static void main(String[] args) {
        String ans = "";
        subseq("abc", ans);
    }

    static void subseq(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        subseq(str.substring(1), ans + ch);
        subseq(str.substring(1), ans);
    }
}
