import java.util.*;

public class ValidAnagram {
    public static void main(String args[]){
        String s = "tulip";
        String t = "lipid";
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0) +1);
        }

        for(int i = 0; i< t.length();i++){
            char ch = t.charAt(i);
            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }
                else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }
            else{
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(hm.isEmpty());
    }
}
