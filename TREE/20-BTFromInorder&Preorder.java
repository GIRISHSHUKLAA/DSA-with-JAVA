import java.lang.*;

class Node
{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
        left=right=null;
    }
}


public class BTFromInorderAndPreorder {

    public static void main(String[] args)
    {
        int[] in ={20,10,40,30,50};
        int[] pre ={10,20,30,40,50};
        int n= in.length;
        Node root=cTree(in, pre, 0, n-1);

        inorder(root);
    }

    static int preIndex=0;
    public static Node cTree(int[] in, int[] pre, int is, int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex++]);

        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=cTree(in, pre, is, inIndex-1);
        root.right=cTree(in, pre, inIndex+1, ie);
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
} 
