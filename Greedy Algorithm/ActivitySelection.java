import java.util.*;

public class ActivitySelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};   //sorted already so T.C  is O(n)

        // if array is not sorted
        int activities[][] = new int[start.length][3];
        for(int i = 0; i< start.length;i++){ //o(nlog) total time
            activities[i][0] = i;                                         //storing val of i becoz after sorting index will change
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lamba function: short waveform
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));    

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //choosing 1st activity
        maxAct = 1;

       // ans.add(0);
        ans.add(activities[0][0]);  // for 2d or if not sorted

       // int lastEnd = end[0];
        int lastEnd = activities[0][2];   //for 2d 


        for(int i = 1; i< start.length;i++){
            if( start[i] >= lastEnd){                            // if(activities[i][1] >= lastend) 
                maxAct++;

                // ans.add(i);                    
                ans.add(activities[i][0]);

                // lastEnd = end[i];              
                lastEnd = (activities[i][2]);
            }
        }

        System.out.println(" maximum activies are : " + maxAct);
        for(int i = 0; i< ans.size();i++){             //printing activiteis
            System.out.print("A"+ans.get(i) + " ");
        }
    }
}
