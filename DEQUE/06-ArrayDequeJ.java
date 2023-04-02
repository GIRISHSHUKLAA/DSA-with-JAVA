import java.util.ArrayDeque;

public class ArrayDequeJ {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(); // This will create an empty stack
        ad.push(10);
        ad.push(20);
        System.out.println(ad.peek());
        System.out.println(ad.pop());
        System.out.println(ad.peek());
        ad.push(40);
        System.out.println(ad.peek());
    }
}
