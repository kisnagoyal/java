public class IsSorted {

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return isSorted(arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {2,4,7,8,10,10,11,11};
        int i = 0;
        System.out.println(isSorted(arr, i));    
    }
}
