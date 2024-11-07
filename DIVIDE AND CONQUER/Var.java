public class Var {

    public static void quickSort(int arr[],int si,int ei){
        if(si >=ei){
            return;
        }
        int pIdx = partition(arr,si,ei);   //pivot index
        quickSort(arr, si, pIdx-1); // for left part
        quickSort(arr, pIdx +1, ei); // for right part
    }

    public static int partition(int arr[],int si,int ei){
        int lb = si;
        int ub = ei;

        int pivot = arr[ei];
        while(si < ei){

            while(arr[si] <= pivot && si < ei){
                si++;
            }
            while(arr[ei] > pivot){
                ei--;
            }
            if(si < ei){
                int temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
            }
        }
        int temp = arr[ub];
        arr[lb] = arr[si];
        arr[si] = temp;
        return si;
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
