class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class DelHeadCSLL {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = head;
        printlist(head);
        head = delHead1(head);
        System.out.println();
        printlist(head);
        System.out.println();
        head = delHead2(head);
        printlist(head);


    }

    static Node delHead1(Node head) {
//        Naive Solution
//        Time Complexity:- O(n)
        if (head == null) return null;
        if (head.next == head)
            return null;
        Node curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = head.next;
        return (curr.next);
    }

    static Node delHead2(Node head) {
//        Naive Solution
//        Time Complexity:- O(1)
        if (head == null) return null;
        if (head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void printlist(Node head) {
        if (head == null) return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }
} 
