import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(5);
        q.add(15);
        q.add(20);
        System.out.println("Before Reversing");
        print(q);
        reverseQueue(q);
        System.out.println("\nAfter reversing");
        print(q);
        recReverseQueue(q);
        System.out.println("\nAfter reversing");
        print(q);
    }

    private static void reverseQueue(Queue<Integer> q) {
//        Iterative Method
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.add(q.peek());
            q.remove();
        }
        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
        }
    }

    private static void recReverseQueue(Queue<Integer> q) {
//        Recursive Approach
        if (q.isEmpty())
            return;
        int x = q.remove();
        recReverseQueue(q);
        q.add(x);
    }

    static void print(Queue<Integer> q) {
        for (Integer x : q)
            System.out.print(x + " ");
    }
}

