import java.util.*;
public class Temp{
    public static void counting(int arr[]){
        int range = Integer.MIN_VALUE;
    
        for(int i = 0; i < arr.length;i++){
            range = Math.max(range,arr[i]);
        
        }
        int count[] = new int[range +1];
        for(int i = 0; i<arr.length;i++){
            
            
                count[arr[i]]++;
            
        }
        int l = 0;
        for(int j = 0; j< count.length;j++){
            while(count[j] >0){
                arr[l] = j;
                
                count[j]--;
                l++;
            }
        }
        for(int k = 0; k< arr.length;k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        counting(arr);
        
    }
}