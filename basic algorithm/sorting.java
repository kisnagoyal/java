import java.util.*;
public class sorting{
    public static  void bubblesort(int numbers[]){
        for(int turn = 0; turn < numbers.length-1;turn++){
            for(int j = 0; j < numbers.length-1-turn; j++){
                if(numbers[j] > numbers[j+1]){
                    //swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
                

            }
        }
    }

    public static void selectionsort(int numbers[]){
        for(int i = 0; i < numbers.length-1;i++){
            int minpos = i;
            for(int j = i+1; j < numbers.length;j++){
                if(numbers[j] < numbers[minpos]){
                   minpos = j;
                }
            }
            //swap
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            numbers[i]= temp;
        }
        for(int i = 0; i < numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void printsort(int numbers[]){
        for(int i = 0; i < numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
    public static void insertion(int numbers[]){
        for(int i = 1; i < numbers.length; i++){
            int curr = numbers[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && numbers[prev] > curr){
               numbers[prev +1] = numbers[prev];
                prev--;
            }
            //insertion
            numbers[prev +1] = curr;
        }
        for(int i = 0; i < numbers.length;i++){
             System.out.print(numbers[i] + " " );
         }

    }

    public static void countingSort(int arr[]){
        int range = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
            range = Math.max(arr[i],range);
        }
        int count[] = new int[range+1];
        for(int i = 0; i < arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i = 0; i < count.length;i++){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }


    public static void main(String args[]){
        int numbers[] = {8,7,6,5,4,3,21};
        // Arrays.sort(numbers);
        // Arrays.sort(numbers,0,3);
        // Arrays.sort(numbers, Collections.reverseOrder());

    //    bubblesort(numbers);
    countingSort(numbers);
        printsort(numbers);
    // selectionsort(numbers);
    // insertion(numbers);
    }
}