import java.util.*;
public class largestSmallest{
    public static int MaxMin(int numbers[]){
        int max = Integer.MIN_VALUE;   // for -infinity
        int min = Integer.MAX_VALUE;   // for + infinity
        for(int i=0; i < numbers.length;i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println("min no is: " + min);
         return max;
    }





    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6};
        System.out.println("max no is: "+  MaxMin(numbers));
    }
     



    
}