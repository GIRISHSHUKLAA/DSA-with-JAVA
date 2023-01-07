class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class SegregateEvenOdd {
    public static void main(String[] args) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);
        printlist(head);
        head = segregate(head);
        printlist(head);
    }

    public static Node segregate(Node head) {
        Node eS = null, eE = null, oS = null, oE = null;
        for (Node curr = head; curr != null; curr = curr.next) {
            int x = curr.data;
            if (x % 2 == 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                } else {
                    eE.next = curr;
                    eE = eE.next;
                }
            } else {
                if (oS == null) {
                    oS = curr;
                    oE = oS;
                } else {
                    oE.next = curr;
                    oE = oE.next;
                }
            }
        }
        if (oS == null || eS == null) {
            return head;
        }
        eE.next = oS;
        oE.next = null;
        return eS;
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
