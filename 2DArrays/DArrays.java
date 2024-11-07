import java.util.*;
public class DArrays{

    public static void creation(int arr[][], int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                 arr[i][j] = sc.nextInt();
            }
        }
    }

    public static boolean searchkey(int arr[][], int m, int n, int key){
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j]==key){
                    // i++; j++;                                                            just for fun....
                    System.out.println("(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void printarr(int arr[][], int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void diagonalsum(int arr[][], int m, int n){
        int sum = 0;
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(i == j){
        //             sum += arr[i][j];   
        //         }
        //         else if( i + j == n-1){
        //             sum+= arr[i][j];                                  // for secondary diagonal i + j = n-1;;
        //         }
        //     }
        // }
        // System.out.println("sum is : " + sum);

        // METHOD 2 with great time complexity
        for(int i = 0; i < arr.length; i++){
            // for primary diagonal
            sum+= arr[i][i];
            // for secon.. diagonal
            if(i != arr.length -1-i ){
            sum+= arr[i][arr.length -1-i];
            }                                               // i + j = n-1 this implies j = n-1-i
        }
        System.out.println("sum is : " + sum);
    }




    public static void main(String args[]){
        int arr[][] = new int[3][3];
         int m = arr.length;
        int n = arr[0].length;
        int key = 4;
        creation(arr,m,n);
        printarr(arr,m,n);
        // searchkey(arr,m,n,key);
        // diagonalsum(arr,m,n);
    }
}