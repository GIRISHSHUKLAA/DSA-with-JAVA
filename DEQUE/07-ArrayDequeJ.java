import java.util.ArrayDeque;

public class ArrayDequeJ {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(); 
        ad.offer(10);
        ad.offer(20);
        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad.peek());
        ad.offer(40);
        System.out.println(ad.peek());
    }
}
