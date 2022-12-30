class Node {
    Node next;
    int data;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class NthNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        NthNodefromEnd(head, 3);
        NthNodefromEnd2(head, 3);

    }

    public static void NthNodefromEnd(Node head, int x) {
//        Naive solution
        int len = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            len++;
        }
        if (len < x)
            return;
        Node curr = head;
        for (int i = 1; i < len - x + 1; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void NthNodefromEnd2(Node head, int x) {
//        Efficient Approach
        /*
         * Using two pointer approach
         * Move 'first' two position ahead
         * Start 'second' pointer from head
         * When your first pointer reaches null then your second pointer reaches the required node
         */
        if (head == null) {
            return;
        }
        Node first = head;
        for (int i = 0; i < x; i++) {
            if (first == null)
                return;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);

    }

}
