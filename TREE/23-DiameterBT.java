import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        left = right = null;
        data = d;
    }
}

public class DiameterBT {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(70);
        System.out.println(diameter(root));
        System.out.println(diameter2(root));

    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameter(Node root) {
//        Naive Solution
//        Naive Solution:-O(n^2)
        if (root == null)
            return 0;
        int d1 = 1 + height(root.left) + height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }

    static int res = 0;

    public static int diameter2(Node root) {
//        Efficient Solution
//        Time Complexity:-O(n)
        int maxHeight = 0;
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, 1 + lh + rh);

        maxHeight = 1 + Math.max(lh, rh); // This will give the max height of the tree

        return res;
    }
}
