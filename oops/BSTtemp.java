import java.util.*;

class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            Node left, right;
        }

    }

public class BSTtemp{
    

    public static Node insertion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = sc.nextInt();    
        if(data == -1){
            return null;
        } 
        Node root = new Node(data);
        System.out.println("Enter left for " + data);
        root.left  = insertion();
        System.out.println("Enter right for " + data);
        root.right  = insertion();
        return root;
    }

    public static int min(Node root,int k){
        int count = 0;
        if(root.left.data == -1){
            count++;
            return 0;
        }
        if(count == k){
            return root.data;
        }
        int min = min(root.left,k);
    }

    public static void main(String args[]){

        insertion();

    }
}