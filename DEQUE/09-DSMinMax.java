import java.util.ArrayDeque;
import java.util.Deque;

class MyDS {
    Deque<Integer> dq;

    MyDS() {
        dq = new ArrayDeque<>();
    }

    void insertMin(int x) {
        dq.offerFirst(x);
    }

    void insertMax(int x) {
        dq.offerLast(x);
    }

    int getMin() {
        return dq.peekFirst();
    }

    int getMax() {
        return dq.peekLast();
    }

    int extractMin() {
//        To remove the minimum item in the given list
        return dq.pollFirst();
    }

    int extractMax() {
//        To remove the maximum item in the given list
        return dq.pollLast();
    }
}

public class DSMinMax {
    public static void main(String[] args) {
        MyDS ds = new MyDS();
        ds.insertMin(10);
        ds.insertMax(15);
        ds.insertMin(5);

        int x = ds.extractMin();
        System.out.println(x);
        x = ds.extractMax();
        System.out.println(x);

        ds.insertMin(8);

    }
}
