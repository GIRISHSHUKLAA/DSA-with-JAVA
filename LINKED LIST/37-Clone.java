import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node next, random;

    Node(int x) {
        data = x;
        next = random = null;
    }
}

public class Clone {

    public static void print(Node start) {
        Node ptr = start;
        while (ptr != null) {
            System.out.println("Data = " + ptr.data + ", Random  = " + ptr.random.data);
            ptr = ptr.next;
        }
    }

    public static Node clone(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        for (Node curr = head; curr != null; curr = curr.next)
            hm.put(curr, new Node(curr.data));

        for (Node curr = head; curr != null; curr = curr.next) {
            Node cloneCurr = hm.get(curr);
            cloneCurr.next = hm.get(curr.next);
            cloneCurr.random = hm.get(curr.random);
        }
        Node head2 = hm.get(head);

        return head2;
    }

    public static Node clone2(Node head) {
        Node next, temp;
        for (Node curr = head; curr != null; ) {
//            Insert the clone Node alternatively
            next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr = next;
        }
        for (Node curr = head; curr != null; curr = curr.next.next) {
//            Connect the clone Node with random
            curr.next.random = (curr.random != null) ? (curr.random.next) : null;
        }

        Node original = head, copy = head.next;

        temp = copy;
//          Separate the original and clone node
        while (original != null && copy != null) {
            original.next =
                    original.next != null ? original.next.next : original.next;

            copy.next = copy.next != null ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(20);

        head.random = head.next.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next.next.next;

        System.out.print("Original list : \n");
        print(head);

        System.out.print("\nCloned list : \n");
        Node cloned_list = clone2(head);
        print(cloned_list);
    }
} 

