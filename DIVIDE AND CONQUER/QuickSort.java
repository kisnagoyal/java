public class QuickSort {

    public static void quickSort(int arr[],int si,int ei){
        if(si >=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);   //pivot index
        quickSort(arr, si, pIdx-1); // for left part
        quickSort(arr, pIdx +1, ei); // for right part
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; // to make places for elemnts smaller than pivot
        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //placing pivot at right position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,4};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
