public class RotArray{


    public static int search(int arr[], int key,int si,int ei){
        while(si <= ei){
            int mid = si +  ( ei-si)/2;
            if(arr[mid]==key){
                return mid;
            }

            if(arr[si]<=arr[mid]){
                if(key >= arr[si] && key < arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                if(key <= arr[ei] && key >arr[mid]){
                    si = mid + 1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,20,0,1,2};
        int key = 20;
        System.out.println(search(arr,key,0,arr.length-1));
    }
}