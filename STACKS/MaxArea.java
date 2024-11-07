import java.util.*;

public class MaxArea {
    public static int maxArr(int arr[]){ //O(n) - optimised code
        int maxArr = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        //Next smaller right;
        for(int i = arr.length -1; i>= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        for(int i = 0; i< arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Area : width = j - i - 1
        for(int i = 0; i < arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArr = height*width;
            maxArr = Math.max(maxArr, currArr);
        }
        return maxArr;

    }

    public static void main(String args[]){
        int arr[] = {2,4}; //heights in histogram
        System.out.println(maxArr(arr));
    }
}
