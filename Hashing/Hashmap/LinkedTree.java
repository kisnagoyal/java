import java.util.*;
public class LinkedTree {
    public static void main(String args[]){
        System.out.print("HASHMAP : ");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("china",150);
        hm.put("India",100);
        hm.put("srilanka",10);
        hm.put("Indonesia",50);
        

        System.out.println(hm);
        System.out.println();

        System.out.print("Linked Hashmap : ");
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("china",150);
        lhm.put("India",100);
        lhm.put("srilanka",10);
        lhm.put("Indonesia",50);
        
        System.out.println(lhm);
        System.out.println();

        System.out.print("Tree Hashmap : ");
        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("China",150);                                                                          
        thm.put("Indonesia",50);
        thm.put("India",100);
        thm.put("Srilanka",10);
        System.out.println(thm);
    }
}
