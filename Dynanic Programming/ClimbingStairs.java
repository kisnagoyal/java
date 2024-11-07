
public class ClimbingStairs {
    private static int countWays(int n) {
        if(n == 0 || n==1){
            return 1;
        }
        // if(n <0){
        //     return 0;
        // }
        return countWays(n-1) + countWays(n-2);
    }
    public static int countWaysMemoization(int n,int dp[]){
        if(n ==0){
            return 1;
        }
        if(n <0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = countWaysMemoization(n-1, dp) + countWaysMemoization(n-2, dp);
        return dp[n];
    }
    public static int countWaysVariation3(int n,int dp[]){
        if(n == 0){
            return 1;
        }
        if(n <0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = countWaysVariation3(n-1, dp) + countWaysVariation3(n-2, dp) + countWaysVariation3(n-3, dp);
        return dp[n];
    }
    public static int countWaysTabulation(int n){
        int ways[] = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
        for(int i = 2; i<ways.length;i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));

        System.out.println("Memoization " + countWaysMemoization(n, new int[n+1]));

        System.out.println("Variance " + countWaysVariation3(n, new int[n+1]));

        System.out.println("Tabuation " + countWaysTabulation(n));
    }

    
}
