import java.util.LinkedList;
import java.util.Queue;
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

public class SpiralTreeTraversal {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        printSpiral(root);

    }

    public static void printSpiral(Node root) {
//       Time Complexity:- O(n)
        if (root == null) return;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.add(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null)
                    s2.add(temp.right);

                if (temp.left != null)
                    s2.add(temp.left);
            }
            while (!s2.isEmpty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    s1.add(temp.left);

                if (temp.right != null)
                    s1.add(temp.right);
            }

        }

    }
} 
