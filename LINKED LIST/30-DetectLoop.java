import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(15);
        head.next = new Node(10);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
//        System.out.println(detectLoop1(head));
        System.out.println(detectLoop3(head));

    }

    public static boolean detectLoop1(Node head) {
        Node temp = new Node(0);
        Node curr = head;
        while (curr != null) {
            if (curr.next == null)
                return false;
            if (curr.next == temp)
                return true;
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }

    static boolean detectLoop2(Node head) {
        HashSet<Node> s = new HashSet<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            if (s.contains(curr))
                return true;
            s.add(curr);
        }
        return false;
    }

    static boolean detectLoop3(Node head) {
//        Floyd-Cycle Algorithm
        Node slow_p = head, fast_p = head;

        while (fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;
    }


    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
