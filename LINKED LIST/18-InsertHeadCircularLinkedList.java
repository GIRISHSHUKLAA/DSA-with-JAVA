class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertBeginCSLL {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = head;
        printlist(head);
        head = insertBegin1(head, 159);
        System.out.println();
        printlist(head);
        System.out.println();
        head = insertBegin2(head, 1);
        printlist(head);


    }

    static Node insertBegin1(Node head, int x) {
//        Naive Solution
//        Time Complexity:- O(n)
        Node temp = new Node(x);
        if (head == null)
            temp.next = temp;
        else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    static Node insertBegin2(Node head, int x) {
//        Naive Solution
//        Time Complexity:- O(1)
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return head;
        }
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
