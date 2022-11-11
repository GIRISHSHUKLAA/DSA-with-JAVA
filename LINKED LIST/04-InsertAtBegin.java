class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class InsertAtBeginSinglyLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);
        printList(head);
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static Node insertAtBegin(Node head, int x) {
//        Time Complexity:- O(1)
        Node temp = new Node(x); // allocate memory for the new node  store the reference in temp variable
        temp.next = head;
        return temp; // returning temp as new head
    }
    /*
     * Interesting thing about Insert At Begin is "The order in which you insert the item, your Linked  list have those
     * item in reverse order because we are inserting at the beginning of a linked list
     */

}
