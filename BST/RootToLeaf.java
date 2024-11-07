import java.util.ArrayList;
public class RootToLeaf {
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
    public static void rootLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootLeaf(root.left, path);
        rootLeaf(root.right, path);
        path.remove(path.size()-1);

    }

    public static void printPath( ArrayList<Integer> path){
        for(int i = 0; i< path.size();i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0; i< values.length;i++){
            root = buildtree(root, values[i]);
        }

        rootLeaf(root, new ArrayList<>());
    }
}
