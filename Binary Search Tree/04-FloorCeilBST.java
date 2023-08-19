class Node {
    int key;
    Node left;
    Node right;

    Node(int d) {
        left = right = null;
        key = d;
    }
}

public class FloorCeilBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(30);
        int x = 30;
        System.out.println(floorBST(root, x));

    }

    public static int floorBST(Node root, int x) {
        if (root == null) return 0;

        Node curr = null;
        while (root != null) {
            if (root.key > x) root = root.left;
            else if (root.key < x) {
                curr = root;
                root = root.right;
            } else return root.key;

        }
        return curr.key;
    }

    public static int ceilBST(Node root, int x) {
        if (root == null) return 0;

        Node curr = null;
        while (root != null) {
            if (root.key > x) {
                curr = root;
                root = root.left;
            } else if (root.key < x) {
                root = root.right;
            } else return root.key;

        }
        return curr.key;
    }
}
