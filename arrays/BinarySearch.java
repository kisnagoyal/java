import java.util.*;
public class BinarySearch{
    public static int BinarySearch(int numbers[],int key){
        int start = 0; 
        int end = numbers.length -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                key =mid;
                return key;
            }
            else if(numbers[mid]  < key){      //right me h key
                start = mid+1;
            }
            else{                    //left me h key mid k;
                end = mid -1;
            }
        }
        return -1;
    }



    public static void main(String args[]){
        int numbers[] ={34,56,765,1200};
        int key = 765;
        System.out.println("key is:"+ BinarySearch(numbers,key));
    }
}