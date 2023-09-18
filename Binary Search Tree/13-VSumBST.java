import java.util.Map;
import java.util.TreeMap;

class Node {
    Node left, right;
    int key;

    Node(int k) {
        left = right = null;
        key = k;
    }
}

public class VSumBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);

        vSum(root);

    }

    public static void vSum(Node root) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        vSumR(root, 0, m);
        for (Map.Entry sum : m.entrySet())
            System.out.print(sum.getValue() + " ");
    }

    public static void vSumR(Node root, int hd, TreeMap<Integer, Integer> m) {
        if (root == null) return;

        vSumR(root.left, hd - 1, m);
        int pSum = m.getOrDefault(hd, 0);
        m.put(hd, pSum + root.key);
        vSumR(root.right, hd + 1, m);
    }
}
