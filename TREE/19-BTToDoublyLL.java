class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class BTToDLL {
    static Node prev = null;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        Node head = BTToDoublyLL(root);
        printlist(head);
    }

    private static Node BTToDoublyLL(Node root) {
//        Time Complexity:-O(n)
//        Space Complexity:-O(h)
        if (root == null) {
            return root;
        }
        Node head = BTToDoublyLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTToDoublyLL(root.right);
        return head;
    }

    private static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
        System.out.println();
    }
}
