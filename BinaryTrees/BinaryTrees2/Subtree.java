import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Subtree {
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
    public static boolean isIdentical(Node root, Node subNode){
        if(root == null && subNode == null){
            return true;
        }
        else if(root == null || subNode == null || root.data != subNode.data){
            return false;
        }
        if(!isIdentical(root.left, subNode.left)){
            return false;
        }
        if(!isIdentical(root.right, subNode.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subNode){
        if(root == null){
            return false;
        }
        if(root.data == subNode.data){
            if(isIdentical(root,subNode)){
                return true;
            }
        }
        return isSubtree(root.left, subNode) || isSubtree(root.right, subNode);

    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        int min = 0, max = 0;
        //level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> hm = new HashMap<>();

        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!hm.containsKey(curr.hd)){
                    hm.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min,curr.hd -1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd +1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i = min; i<=max;i++){
            System.out.print(hm.get(i).data + " ");
        }
        System.out.println();

        
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subNode = new Node(2);
        subNode.left = new Node(4);
        subNode.right = new Node(5);
        // subNode.left.right = new Node(7);

        // System.out.println(isSubtree(root, subNode));

        topView(root);

    }
}
