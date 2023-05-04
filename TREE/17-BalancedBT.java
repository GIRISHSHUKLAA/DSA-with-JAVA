class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class BalancedBT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);
        if (isBalanced(root) > 0)
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
    }

    public static int isBalanced(Node root) {
//       Efficient Solution
        if (root == null)
            return 0;
        int lh = isBalanced(root.left);
        if (lh == -1) return -1;
        int rh = isBalanced(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }
}

