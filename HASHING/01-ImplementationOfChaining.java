import java.util.*;

class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b) {
        BUCKET = b;
        table = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<>());
        }
    }

    void insert(Integer k) {
        int i = k % BUCKET;
        table.get(i).add(k);
    }

    void delete(Integer k) {
        int i = k % BUCKET;
        table.get(i).remove(k);
    }

    boolean search(Integer k) {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }

}

public class hashing {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        System.out.println(mh.search(10));
        mh.delete(15);
        System.out.println(mh.search(15));
    }
}
