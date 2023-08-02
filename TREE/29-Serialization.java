import java.util.ArrayList;

class Node {
    Node left;
    Node right;
    int data;

    Node(int d) {
        left = right = null;
        data = d;
    }
}

public class Serialization {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        ArrayList<Integer> arr = new ArrayList<>();
        serialize(root, arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static final int EMPTY = -1;

    private static void serialize(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.data);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }
}
