import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTraversing {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);
        Iterator<Integer> it = d.iterator();
//        Method 1:- From first to last
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

//        Method 2:- From first to last
        for (int x : d) {
            System.out.print(x + " ");
        }
        System.out.println();

//        Method 3:- From last to first
        Iterator<Integer> it2 = d.descendingIterator();
        while (it2.hasNext())
            System.out.print(it2.next() + " ");
        System.out.println();

    }
}
