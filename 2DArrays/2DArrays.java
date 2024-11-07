import java.util.*;
public class DArrays{

    public static void creation(int arr[]){
        int m = arr.length;
        int n = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                 arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                System.out.print(arr[m][n] + " ");
            }
            System.out.println();
        }
    }





    public static void main(String args[]){
        int arr[][] = new int[3][3];
        creation(arr);
    }
}