class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class InsertAtGivenPositionInSinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printlist(head);
        head = insertPosition(head, 4, 45);
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

    public static Node insertPosition(Node head, int pos, int data) {
//        Time Complexity:- O(n)
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2; i++) {
            curr = curr.next;
        }
        if (curr == null) {
//            When somebody gives you position which is beyond the Linked List size+1
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        /*
         * If you do current.temp first then you will lose the track of remaining linked list,
         * so you have to do temp.next=curr.next first
         *
         */
        return head;
    }
}

