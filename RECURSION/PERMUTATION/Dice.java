import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet(4,""));
    }

    static void dice(int target, String p) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(target - i,p + i);
        }
    }

    static ArrayList<String> diceRet(int target, String p) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(target - i,p + i));
        }
        return list;
    }


    static void diceFace(int target, String p, int face) {
//        dice can be 7 face or 8 face or any face
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(target - i,p + i, face);
        }
    }

    static ArrayList<String> diceFaceRet(int target, String p, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(target - i,p + i,face));
        }
        return list;
    }
}
