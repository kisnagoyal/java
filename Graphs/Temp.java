

import java.util.*;

public class Temp {
    public static int minimumCost(List<Integer> pods, List<Integer> cost) {
        int n = pods.size();
        int totalCost = 0;

        // Use a set to track occupied pod values
        Set<Integer> usedPods = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int pod = pods.get(i);
            int currentCost = 0;

            // If the pod value is already used, increment until unique
            while (usedPods.contains(pod)) {
                pod++; // Increment pod value
                currentCost = cost.get(i); // Add cost for incrementing this pod
            }

            // Update the pods list with the new unique pod value
            pods.set(i, pod);

            // Once a unique pod is found, add it to the set and increase totalCost
            usedPods.add(pod);
            totalCost += currentCost;
        }

        return totalCost;
    }
    

    public static void main(String[] args) {
        List<Integer> pods = new ArrayList<>(Arrays.asList(4,9,3,3,3)); //4 
        List<Integer> cost = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        
        int result = minimumCost(pods, cost);
        System.out.println("Minimum cost: " + result);
        System.out.println("Final pod allocation: " + pods);
}

}