
public class Basic {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) { // O(L)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) { // i == 1 becoz .substring(0,0) not valid
            if (search(key.substring(0, i)) && wordbreak(key.substring(i))) {
                return true;
            } 
        }
        return false;
    }

    public static void main(String args[]) {
        // String words[] = {"the","a","there","their","any","thee"};
        // for(int i = 0; i< words.length;i++){
        // insert(words[i]);
        // }
        // System.out.println(search("theor"));
        // System.out.println(search("their"));

        // word Break
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String key = "ilikesam";
        System.out.println(wordbreak(key));
    }
}
