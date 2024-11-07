import java.util.*;
public class FractionalKnapsack {
    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[value.length][2];
        //0th col will store index and 1st col store ratio

        for(int i = 0; i< value.length;i++){
            ratio[i][0]=i;
            ratio[i][1] =  value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));  //ascending order

        int capacity = W;
        int finalvalue = 0;

        for(int i = value.length-1; i>=0;i--){
            int idx = (int)ratio[i][0];
            if(weight[idx] <= capacity){
                finalvalue += value[idx];
                capacity -= weight[idx];
            }
            else{
                finalvalue += (capacity*ratio[i][1]);
                capacity = 0;
                break;
            }
        }
        System.out.println("max value is " + finalvalue);
    }
}
