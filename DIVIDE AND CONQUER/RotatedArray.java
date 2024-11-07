public class RotatedArray {
    public static int search(int arr[],int target,int si,int ei){
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei -si)/2;
        //case found
        if(target == arr[mid]){
            return mid;
        }
        //mid on Line 1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(target >= arr[si] && target < arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //case b : right
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        //mid on right
        else{
            //case a : right
            if(target >= arr[mid] && target < arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //case b : left
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String args[]){
         int arr[] = {4,5,6,7,0,1,2};
         int target = 01;
        int tidx = search(arr, target, 0, arr.length-1);

        System.out.println(tidx);
    }
}
