import java.lang.reflect.Array;
import java.util.*;

public class BstToBalanced {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static Node createBst(ArrayList<Integer> arr, int si , int ei ){
        if(si > ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr, si, mid-1);
        root.right = createBst(arr, mid+1, ei);
        
        return root;
        
    }
    public static Node balancedBST(Node root){
        // finding inorder
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);

        //creating balancedBST
        return createBst(arr, 0, arr.size()-1);
    }

    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
  
    }

    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root = balancedBST(root);
        preorder(root);


    }
}
