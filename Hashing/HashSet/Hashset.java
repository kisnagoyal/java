import java.util.HashSet;
import java.util.*;

public class Hashset {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("delhi");
        cities.add("noida");
        cities.add("alwar");

        System.out.println(cities);
        System.out.println(cities.contains("delhi"));
        cities.remove("delhi");
        System.out.println(cities.contains("delhi"));

        // cities.clear();
        System.out.println(cities.size());
        System.out.println(cities.isEmpty());

        System.out.println("-------------------------------------------------------------------------");
    //iteration
        // a) using iterator
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("---------------------------------------------------------------------------");
        // b) using for-each loop
        for(String s : cities){
            System.out.println(s);
        }
        

    }
}
