import java.lang.*;
import java.util.Scanner;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}


public class InsertBST {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int n = sc.nextInt();
        root = recurInsertBST(root, n);
    }

    public static Node recurInsertBST(Node root, int n) {
        if (root == null) {
            return new Node(n);
        }
        if (root.key > n)
            root.left = recurInsertBST(root.left, n);

        else if (root.key < n) {
            root.right = recurInsertBST(root.right, n);
        }
        return root;
    }

    public static Node iterInsertBST(Node root, int n) {
        Node temp = new Node(n);
        Node parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.key > n)
                curr = curr.left;
            else if (curr.key < n)
                curr = curr.right;
            else return root;
        }
        if (parent == null)
            return new Node(n);
        if (parent.key > n)
            parent.left = temp;
        else
            parent.right = temp;
        return root;
    }
}
