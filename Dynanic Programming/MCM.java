import java.util.Arrays;

public class MCM {
    public static int mcmRec(int arr[], int i, int j){
        if(i == j){
            //single matrix
            return 0; //cost is zero
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k <j;k++){ 
            int cost1 = mcmRec(arr, i, k); // Ai....Ak => arr[i-1]*arr[k]
            int cost2 = mcmRec(arr, k+1, j); // Ak+1....Aj => arr[k]*arr[j]
            int cost3 = arr[i-1]*arr[k]*arr[j];

            int finalans =cost1 + cost2 + cost3;
            ans =  Math.min(ans, finalans);
        }

        return ans;
    }
    public static int mcmMemo(int arr[],int i, int j, int dp[][]){
        if(i== j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<j;k++){
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];

            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalcost);
            
        }
        return dp[i][j] = ans;
    }

    public static int mcmTab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];

        //initialization
        for(int i = 0; i<n;i++){
            dp[i][i] = 0;
        }

        for(int len = 2; len<= n-1;len++){
            for(int i = 1; i<= n-len;i++){
                int j = i+len -1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i; k<j;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j],cost1 + cost2 + cost3);

                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;

        System.out.println(mcmRec(arr, 1, n-1));

        int dp[][] = new int[n][n];
        for(int i = 0; i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        System.out.println(mcmMemo(arr, 1, n-1, dp));

        System.out.println(mcmTab(arr));
    }
}