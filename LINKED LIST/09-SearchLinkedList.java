class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class SearchLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println(searchIterative(head, 4));
        System.out.println(searchRecr(head, 4));

    }

    public static int searchIterative(Node head, int x) {
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(1)
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

    public static int searchRecr(Node head, int x) {
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)

        if (head == null)
            return -1;
        if (head.data == x)
            return 1;
        else {
            int res = searchRecr(head.next, x);
            if (res == -1) {
                return -1;
            } else return res + 1;

        }
    }
}

