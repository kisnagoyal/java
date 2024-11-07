public class CreateBst {      //creating using sorted array
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

    public static Node createBst(int  arr[], int si, int ei){
        if(si >ei){
            return null;
        }
        int mid = si + (ei-si)/2;

        Node root = new Node(arr[mid]);
        root.left = createBst(arr, si, mid-1);
        root.right = createBst(arr, mid+1, ei);
    
        return root;

    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    
    public static void main(String args[]){
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBst(arr, 0, arr.length-1);
        preorder(root);

    }
}
