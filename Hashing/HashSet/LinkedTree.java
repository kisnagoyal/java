import java.util.*;

public class LinkedTree {
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("delhi");
        cities.add("noida");
        cities.add("alwar");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("delhi");
        lhs.add("noida");
        lhs.add("alwar");  
        System.out.println(lhs);
        
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("delhi");
        ts.add("noida");
        ts.add("alwar");  
        System.out.println(ts);
    }
}
