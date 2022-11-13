class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class DeleteHeadOfSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head = deleteHead(head);
        printlist(head);
    }

    private static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node deleteHead(Node head) {
//        Time Complexity:- O(1)
        if (head == null)
            return null;
        return head.next;
    }
}
