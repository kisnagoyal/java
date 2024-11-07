public class BackTrackingOne {
    public static void changevalue(int arr[] , int i, int val){
        //base
        if(arr.length == i){
            printArr(arr);
            return;
        }
        //recursion or work
        arr[i] = val;
        changevalue(arr,i+1,val +1);
        arr[i] = arr[i] -2; // BackTracking step
    }

    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changevalue(arr,0,1);
        printArr(arr);

    }
}
