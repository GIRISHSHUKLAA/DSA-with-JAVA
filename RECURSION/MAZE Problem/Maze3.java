import java.util.ArrayList;

public class Maze3 {
    public static void main(String[] args) {
        System.out.println(pathRetDiag("", 3, 3));
    }


    static ArrayList<String> pathRetDiag(String ans, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(pathRetDiag(ans + "D", r - 1, c-1));
        }

        if (r > 1) {
            list.addAll(pathRetDiag(ans + "V", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiag(ans + "H", r, c - 1));
        }
        return list;
    }
}
