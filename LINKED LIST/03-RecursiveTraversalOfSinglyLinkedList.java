class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class RecursiveLinkedlistTraverse {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        recursivePrintlist(head);
    }

    public static void recursivePrintlist(Node head) {
//        Time Complexity:- O(n)
//        Auxiliary Complexity:- O(n)
        if (head == null)
            return;
        System.out.println(head.data);
        recursivePrintlist(head.next);
    }
}
