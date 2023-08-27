class Node {
    int key;
    Node left, right;

    Node(int x) {
        key = x;
        left = right = null;
    }
}

public class CheckBST {
    public static void main(String args[]) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

//        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
//            System.out.println("IS BST");
//        else
//            System.out.println("Not a BST");


        if (isBST2(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

    }
    public static boolean isBST1(Node root, int min, int max) {
//        Time Complexity:-O(n)
        if (root == null)
            return true;

        return (root.key > min && root.key < max &&
                isBST1(root.left, min, root.key) && isBST1(root.right, root.key, max));
    }



    static int prev=Integer.MIN_VALUE;
    public static boolean isBST2(Node root)
    {
//        Time Complexity:O(n)
//        Auxiliary Space:O(h)
        if (root == null)
            return true;

        if(!isBST2(root.left))return false;

        if(root.key<=prev)return false;
        prev=root.key;

        return isBST2(root.right);
    }
}
