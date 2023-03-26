class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class RemoveDuplicate {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(40);
        printlist(head);
//        duplicate(head);
        recDuplicate(head);
        printlist(head);

    }

    public static void duplicate(Node head) {
//        Iterative Method
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
    }

    public static Node recDuplicate(Node head) {
//        Recursive Approach
        if (head == null || head.next == null) return head;
        head.next = recDuplicate(head.next);
        return head.data == head.next.data ? head.next : head;
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
