
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class MaximumInBT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(300);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        System.out.println(maximum(root));
    }

    public static int maximum(Node root) {
//        Time Complexity:- O(n)
//        Space Complexity:- O(h)
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
    }
}
