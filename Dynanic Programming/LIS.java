import java.util.Arrays;
import java.util.HashSet;

public class LIS {
    private static int findLis(int[] arr) {
        HashSet<Integer> set = new HashSet<>(); //for unique elements
        int n = arr.length;
        for(int i = 0; i<n;i++){
            set.add(arr[i]);
        }

        int arr2[] = new int[set.size()];
        int i = 0;
        for(int num :set){
            arr2[i]  = num;
            i++;
        }

        Arrays.sort(arr2);

        return findLcs(arr,arr2);
    }
    private static int findLcs(int[] arr, int[] arr2) {
        int n = arr.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        //initialization by default
        for(int i =1; i<dp.length;i++){
            for(int j =1; j<dp[0].length;j++){
                if(arr[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[n][m];

    }
    public static void main(String[] args) {
        int arr[] = {50,3,10,7,40,80};
        System.out.println(findLis(arr));
    }

    
}
