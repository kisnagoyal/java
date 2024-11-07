import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;

public class Iteration {
    public static void main(String args[]){
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 140);
        hm.put("China",150);
        hm.put("Japan", 70);
        hm.put("Indonesia",100);
        hm.put("Bhutan",10);
        hm.put("Nepal",10);
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key: "+ k + "\t value: " + hm.get(k));
        }

        //entrySet
        
        Set<Entry<String, Integer>> es = hm.entrySet();
        System.out.println(es);

        for (Entry<String,Integer> entry : es) {
            System.out.println(entry);
        }
    }
}

