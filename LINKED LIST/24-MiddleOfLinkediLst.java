class Node {
    Node next;
    int data;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(25);
//        head.next.next.next.next.next = new Node(30);
        printMiddle(head);
        printMiddle2(head);
    }

    static void printMiddle(Node head) {
//        Naive Solution
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr;
        for (curr = head; curr != null; curr = curr.next) {
            count++;
        }
        curr = head;
        for (int i = 0; i < count / 2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    static void printMiddle2(Node head) {
//        Take two node slow and fast, fast move two node at a time and slow move one node at a time
//        when fast become null then slow will be middle node
//        for even no. of node--> fast==null
//        for odd no. of node--> fast.next==null
        if (head == null) {
            return;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }
}
