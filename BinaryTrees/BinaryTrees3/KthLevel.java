import java.util.LinkedList;
import java.util.Queue;

public class KthLevel{
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

    public static void kthLvl(Node root, int k,int level ){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        kthLvl(root.left, k, level+1);
        kthLvl(root.right, k, level+1);
    }
    
    public static void KthLeveliter(Node root,int k){
        if(root == null){
            return;
        }
        int i = 1;
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                i++;
                if(q.isEmpty()){
                    break;
                }else{ 
                    q.add(null);
                }
            }else{
                
                if(i == k){
                    System.out.print(curr.data + " ");
                }
                else{
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }      
            }
        }
    }

    public static int kthAncestor(Node root, int n ,int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);

        if(left == -1 && right == -1){
            return -1;
        }
        int max = Math.max(left,right);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;

    }



    public static void main(String args[]){
        /* 
                    1
                   /  \
                  2    3
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

        // kthLvl(root, 3, 1);

        kthAncestor(root, 4, 1);


    }
}
