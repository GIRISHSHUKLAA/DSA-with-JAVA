import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}


public class Serialization {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.left.right = new Node(40);

        ArrayList<Integer> arr = new ArrayList<>();
        serialize(root, arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        Node root_new = deSerialize(arr);
        inorder(root_new);

    }

    static final int EMPTY = -1;

    public static void serialize(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.key);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }

    static int index = 0;

    public static Node deSerialize(ArrayList<Integer> arr) {
        if (index == arr.size())
            return null;
        int val = arr.get(index);
        index++;
        if (val == EMPTY) return null;
        Node root = new Node(val);
        root.left = deSerialize(arr);
        root.right = deSerialize(arr);
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}
