class Node {
    Node left;
    Node right;
    int key;

    Node(int k) {
        left = right = null;
        key = k;
    }
}

public class KthSmallest {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int k = 3;

        System.out.print("Kth Smallest: "+ printKth(root, k , 0));

    }



    private static int printKth(Node root, int k, int c) {
      // Time Complexity:-O(n)
        if (root == null) return 0;
        c = printKth(root.left, k, c);
        c++;
        if (c == k) {
            System.out.print(root.key);
            return root.key;
        }
        c = printKth(root.right,k,c);

        return root.key;

    }
}
