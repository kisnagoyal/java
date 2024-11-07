public class BuildBst {
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

    public static Node buildtree(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = buildtree(root.left, value);
        }
        else if (root.data < value){
            root.right = buildtree(root.right, value);
        }
        return root;
    }

    public static boolean search(Node root, int key){ //o(h)
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right,key);
        }
        
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val); 
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root){
        while(root != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1 , int k2){
        if(root == null){
            return;
        }
        //case 1
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+ " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data > k2){
            printInRange(root.left, k1, k2);
        }
        else if(root.data <k1){
            printInRange(root.right, k1, k2);
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean isValidBst(Node root, Node min, Node max){  
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }


        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }

    public static void main(String args[]){
        int values[] = {5,3,1,4,6,7,10,11}; //
        Node root = null;

        for(int i = 0; i< values.length;i++){
            root = buildtree(root, values[i]);
        }
        // inorder(root);
        // System.out.println();

        // // System.out.println(search(root, 6));
        // // delete(root, 1);
        // // inorder(root);
        System.out.println(root.data);
        printInRange(root, 7, 12);

    }
}
