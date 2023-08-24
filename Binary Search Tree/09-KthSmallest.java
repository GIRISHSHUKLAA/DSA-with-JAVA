class Node {
    Node left;
    Node right;
    int key;
    int lCount;

    Node(int k) {
        left = right = null;
        key = k;
        lCount = 0;
    }
}

public class KthSmallest {
    public static void main(String[] args) {
        Node root = null;
        int keys[] = {20, 8, 22, 4, 12, 10, 14, 25, 3, 32};

        for (int x : keys)
            root = insert(root, x);

        int k = 4;
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less " + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest" + " Element is " + res.key);

    }

    public static Node insert(Node root, int x) {
        if (root == null) return new Node(x);
        if (root.key > x) {
            root.left = insert(root.left, x);
            root.lCount++;
        } else if (x > root.key)
            root.right = insert(root.right, x);
        return root;
    }

    public static Node kthSmallest(Node root, int k) {
        if (root == null)
            return null;

        int count = root.lCount + 1;
        if (count == k)
            return root;

        if (count > k)
            return kthSmallest(root.left, k);

        return kthSmallest(root.right, k - count);
    }
}
