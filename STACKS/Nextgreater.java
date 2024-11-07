import java.util.*;

public class Nextgreater {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        int arr[] = {5,7,3,1,2,9};
        int nextGr8[] = new int[arr.length];
        for(int i = arr.length-1; i>= 0;i--){
            //step 1 while loop
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            //step 2 if else
            if(s.isEmpty()){
                nextGr8[i] = -1;
            }
            else{
                nextGr8[i] = arr[s.peek()];
            }
            //push
            s.push(i);
        }

        for(int i = 0; i<arr.length;i++){
            System.out.print(nextGr8[i]+ " ");
        }
    }

    //differnt forms:
    // nextgreaterright
    // nextgreaterLeft  for this loop, should be from 0 to arr.length
    //nextSmallerLeft
    //nextSmallerRight  for this, while condition should be reversed
}
