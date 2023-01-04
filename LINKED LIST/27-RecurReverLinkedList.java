class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class ReverseALinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = revLinkedListRecur(head);
        printlist(head);
        head = revLinkedListRecur2(head, null);
        printlist(head);
    }

    public static Node revLinkedListRecur(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest_head = revLinkedListRecur(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    public static Node revLinkedListRecur2(Node curr, Node prev) {
        if (curr == null)
            return prev;
        Node next = curr.next;
        curr.next = prev;
        return revLinkedListRecur2(next, curr);
    }

    private static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
