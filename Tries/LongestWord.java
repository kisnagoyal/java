public class LongestWord {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i=0; i< 26;i++){
                children[i]  = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i< word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static String ans = "";
    public static void longestword(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 25; i>= 0;i--){ // i = 25 for lexicographically larger 
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i + 'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                //backtrack
                temp.deleteCharAt(temp.length()-1);
            } 
        }
    }
    public static void main(String args[]){
        String word[] = {"a","ap","app","banana","appl","apply","apple"};
        for(String w : word){
            insert(w);
        }
        longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
