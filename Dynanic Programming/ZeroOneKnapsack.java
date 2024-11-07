public class ZeroOneKnapsack{

    private static int knapSack(int[] val, int[] wt, int W, int n) {
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1] <= W){
            int max1 =  val[n-1]+ knapSack(val, wt, W-wt[n-1], n-1);
            int max2 = knapSack(val, wt, W, n-1);

            return Math.max(max1,max2);
        }
        else{
            return knapSack(val, wt, W, n-1);
        }
    }

    private static int knapSackMemo(int[] val, int[] wt, int W, int n,int dp[][]) {
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){
            int max1 =  val[n-1]+ knapSackMemo(val, wt, W-wt[n-1], n-1,dp);
            int max2 = knapSackMemo(val, wt, W, n-1,dp);

            dp[n][W] = Math.max(max1,max2);
            return dp[n][W];
        }
        else{
            dp[n][W] = knapSackMemo(val, wt, W, n-1,dp);
            return dp[n][W];
        }
    }

    public static int knapSackTab(int val[],int wt[],int W){ 

        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i< dp.length;i++){ //for rows
            dp[i][0] =0;
        }
        for(int j = 0; j<dp[0].length;j++){
            dp[0][j] =0;
        }

        for(int i = 1; i<val.length +1;i++){
            for(int j = 1; j<W+1;j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){
                    //include
                    int p1 = v + dp[i-1][j-w];
                    //exclude
                    int p2 = dp[i-1][j];

                    dp[i][j] = Math.max(p1, p2);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;

        // System.out.println(knapSack(val,wt,W,val.length));

        int dp[][] = new int[val.length+1][W+1];

        for(int i = 0; i<dp.length;i++){
            for(int j = 0; j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapSackMemo(val, wt, W, val.length,dp));

        System.out.println(knapSackTab(val, wt, W));
    }

    
}