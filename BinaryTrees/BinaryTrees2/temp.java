import java.util.*;

public class temp {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void KthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);

        return;
    }

    static int a = 0;

    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);

        if (left == -1 && right == -1) {
            return -1;
        }

        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;

    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // KthLevel(root,0,2);
        System.out.println(kthAncestor(root, 5, 2));

    }
}