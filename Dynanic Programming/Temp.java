import java.util.Arrays;

public class Temp{

    public int knapSack(int val[],int wt[],int W,int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <= W){
            //add
            int max1 = val[n-1] + knapSack(val, wt, W-wt[n-1], n-1); 
            int max2 = knapSack(val, wt, W, n-1);
            return Math.max(max1, max2);
        }
        else{
            return knapSack(val, wt, W, n-1); 
        }
    }

    public static int knapSackMemo(int dp[][],int val[],int wt[],int W,int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){
            int max1 = val[n-1] + knapSackMemo(dp, val, wt, W-wt[n-1], n-1);
            int max2 = knapSackMemo(dp, val, wt, W, n-1);
            dp[n][W] = Math.max(max1, max2);
        }else{
            dp[n][W] = knapSackMemo(dp, val, wt, W, n-1);
        }
        return dp[n][W];
    }

    public static int knapSackTab(int val[],int wt[],int W,int n){
        int dp[][] = new int[val.length+1][W + 1];
        for(int i = 0; i<val.length+1;i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i< W+1;i++){
            dp[0][i] = 0;
        }
        for(int i = 1; i<dp.length;i++){
            for(int j = 1; j<dp[0].length;j++){
                if(wt[n-1] <= W){
                    int max1 = val[n-1] + dp[n-1][W-wt[n-1]];
                    int max2 = dp[n-1][W];
                    dp[n][W] = Math.max(max1, max2);
                }else{
                    dp[n][W] = dp[n-1][W];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        Temp obj = new Temp();
    //    System.out.println(obj.knapSack(val,wt,W,5));
        for(int i = 0; i<dp.length;i++){
            for(int j = 0; j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapSackMemo(dp, val, wt, W, val.length));
        System.out.println(knapSackTab( val, wt, W, val.length));

    }
}