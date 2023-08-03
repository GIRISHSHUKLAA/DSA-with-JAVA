import java.util.Stack;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}


public class IterPreorder {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right = new Node(30);
        root.right.left = new Node(60);
        iterativePreorder(root);
    }

    public static void iterativePreorder(Node root) {
        if (root == null)
            return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                System.out.print(curr.key + " ");
                if (curr.right != null)
                    st.push(curr.right);
                curr = curr.left;
            }
            if (!st.isEmpty()) {
                curr = st.pop();
            }
        }
    }
}
