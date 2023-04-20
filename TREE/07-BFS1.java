class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class BFS {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        int k = height(root);
        for (int i = 1; i <= k; i++) {
            printKDist(root,i);
        }
    }


    public static int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void printKDist(Node root, int k) {

        if (root == null) return;

        if (k == 1) System.out.print(root.key + " ");
        else {
            printKDist(root.left, k - 1);
            printKDist(root.right, k - 1);
        }
    }
}
