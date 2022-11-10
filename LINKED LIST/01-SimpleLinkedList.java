class Node {
//    We have created a class to represent a node.
//    A Node has data and reference to next node.
    int data; // Data type of Linked list is decided by this line.[Data which we are going to put in every node]
    Node next;// It has a reference of self type.
//    The class is node and type of this reference is also node such structure are called self-referential structure
//    Linked list is an example of self-referential data structure.

    Node(int x) { // Constructor
        data = x;
        next = null; // This line is optional
//    In java if you do not initialize member it becomes null by default
    }
}

public class SimpleLinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);  // Creating objects
        Node temp1 = new Node(20); // Creating objects
        Node temp2 = new Node(30); // Creating objects
        head.next = temp1;  // Linking Objects
        temp1.next = temp2; // Linking Objects
    }
}
