public class Height {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){ //o(n)
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    public static int countNode(Node root){ //o(n)
        if(root == null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc + rc + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls + rs + root.data;
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

        System.out.println(height(root));

        System.out.println(countNode(root));

        System.out.println(sum(root));
    }
}
