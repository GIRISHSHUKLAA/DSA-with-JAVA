class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class LeftView {
    public static void main(String[] args) {
        Node root = new Node(30);
        root.right = new Node(50);
        root.right.left = new Node(60);
        root.right.left.right = new Node(10);
        leftView(root, 1);
    }

    static int maxLevel = 0;

    public static void leftView(Node root, int level) {
//        Time Complexity:- O(n)
//        Space Complexity:- O(h)
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.println(root.key);
            maxLevel = level;
        }
        leftView(root.left, level + 1);
        leftView(root.right, level + 1);
    }
}
