import java.util.ArrayList;

public class LCA {
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

    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getpath(root.left, n, path);
        boolean foundRight = getpath(root.right, n, path);

        if(foundLeft|| foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca (Node root, int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if(root == null){
            return null;
        }
        getpath(root, n1,path1);
        getpath(root, n2,path2);
        int i = 0;
        for(; i< path1.size() && i < path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break; 
            }
        }
        Node lca = path1.get(i-1);
        return lca;

    } 

    public static Node lca2(Node root, int n1, int n2){
        //base case
        if(root == null|| root.data ==  n1 || root.data == n2){
            return root;
        }
        Node lcaLeft = lca2(root.left, n1, n2);
        Node lcaRight = lca2(root.right, n1, n2);

        if(lcaRight == null){
            return lcaLeft;
        }
        if(lcaLeft == null){
            return lcaRight;
        }
        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int  rightDist = lcaDist(root.right,n);

        if(leftdist == -1 && rightDist == -1){
            return -1;
        }
        if(leftdist == -1){
            return rightDist+1;
        }
        else{
            return leftdist+1;
        }
    }


    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int d1 = lcaDist(lca,n1);
        int d2 = lcaDist(lca,n2);

        return d1 + d2;
    }

    public static void main(String args[]){
        /* 
                    1
                   / \
                  2   3
                 / \  / \
                4  5  6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println((lca(root,3,6)).data);
        // System.out.println((lca2(root, 3,6)).data);

        System.out.println(minDist(root, 4, 6));

    }
}
