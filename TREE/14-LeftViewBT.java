import java.util.LinkedList;
import java.util.Queue;

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
        leftView(root);
    }


    public static void leftView(Node root) {
//        Time Complexity:- O(n)
//        Space Complexity:- O(w) or O(n) in worst case
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (i == 0) System.out.print(curr.key + " ");

                if (curr.left != null) q.add(curr.left);

                if (curr.right != null) q.add(curr.right);
            }
        }
    }
}
