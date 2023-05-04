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

public class MaxmWidth {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        System.out.println(maxmWidth(root));
    }

    public static int maxmWidth(Node root) {
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(w)
        int max = 0;
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            max = Math.max(max, count);

            for (int i = 0; i < count; i++) {
                Node curr = q.poll();

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return max;
    }
}
