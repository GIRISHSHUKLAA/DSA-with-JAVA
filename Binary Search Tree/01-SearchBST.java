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


public class SeaarchBST {

    public static void main(String args[]) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 16;

        if (searchRecur(root, x))
            System.out.print("Found");
        else
            System.out.print("Not Found");

        if (searchIter(root, x))
            System.out.print("Found");
        else
            System.out.print("Not Found");
    }

    public static boolean searchRecur(Node root, int x) {
//        Time Complexity:- O(h)
//        Aux. Space:- O(h)

        if (root == null)
            return false;
        if (root.key == x)
            return true;
        else if (root.key > x) {
            return searchRecur(root.left, x);
        } else {
            return searchRecur(root.right, x);
        }
    }

    public static boolean searchIter(Node root, int x) {
//        Time Complexity:- O(h)
//        Aux. Space:- O(1)
        while (root != null) {
            if (root.key == x)
                return true;
            else if (root.key < x)
                root = root.right;
            else
                root = root.left;
        }
        return false;
    }
}                                                    
