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
        duplicate(head);
        printlist(head);

    }

    public static void duplicate(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
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
