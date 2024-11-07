import java.util.HashMap;

public class Hashmap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        //insert
        hm.put("India",100);
        hm.put("china",50);
        hm.put("japan",10);
        hm.put("US",25);

        System.out.println(hm);

        //get
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("netherlands"));

        //containsKey
        System.out.println(hm.containsKey("id"));

        //remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        hm.clear();   //clear or empty hashmap
        System.out.println(!hm.isEmpty());

        
    }
}
