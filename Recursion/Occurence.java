public class Occurence {

    public static int firstOccurence(int arr[], int key,int i){ //)(n), O(n);
        if(i == arr.length){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);              
    }

    public static int lastOccurence(int arr[],int key,int i){
        if(i == -1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr,key,i-1);

    }

    public static int lastOccurence2(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        
        int isFound = lastOccurence2(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String args[]){
        int arr[] = {85,5,5,5};
        int key = 5;
        System.out.println(firstOccurence(arr,key,0));
        System.out.println(lastOccurence(arr,key,arr.length-1));
        System.out.println(lastOccurence2(arr,key,0));
    }
}
