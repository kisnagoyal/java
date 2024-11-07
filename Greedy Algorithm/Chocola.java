import java.util.*;

public class Chocola {
    public static void main(String args[]){
        int n = 4, m = 6;
        Integer verticalCutsCost[] = {2,1,3,1,4};
        Integer horizontalCutsCost[] = {4,1,2};

        Arrays.sort(verticalCutsCost,Collections.reverseOrder());
        Arrays.sort(horizontalCutsCost,Collections.reverseOrder());

        int h = 0, v = 0;
        int hp =1, vp =1;
        int cost = 0;

        while(h < horizontalCutsCost.length && v < verticalCutsCost.length){
            if(verticalCutsCost[v] <= horizontalCutsCost[h]){ // horizontal cuts
                cost += (horizontalCutsCost[h]*vp);
                h++;
                hp++;
            }
            else{
                cost += verticalCutsCost[v]*hp;
                v++;
                vp++;
            }
        }
        while(h < horizontalCutsCost.length){
            cost += (horizontalCutsCost[h]*vp);
            h++;
            hp++;
        }
        while(v < verticalCutsCost.length){
            cost += verticalCutsCost[v]*hp;
            v++;
            vp++;    
        }
        System.out.println("min cost of cutting is " + cost);
    }
}
