public class UniqueSubstring {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i = 0; i< 26;i++){
                children[i] = null;
            }
        }
    } 
    public static Node root = new Node();
    // public static int count =1;


    public static void insert(String word){
        Node curr = root;
        for(int i= 0; i< word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
                // count++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i< 26;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String args[]){
        String str = "apple";
        for(int i = 0; i< str.length();i++){
            insert(str.substring(i));
        }
        
        System.out.println(countNodes(root));
    }
}
