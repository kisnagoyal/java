public class Fibo {
    public static int fib(int n, int dp[]){ //memoization  O(n)
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
    private static int fibTab(int n) { //tabuation O(n)
        int dp[] = new int[n+1];
        dp[0]= 0;
        dp[1] = 1;
        for(int i = 2; i< dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];
        dp[1] = 1;
        System.out.println(fib(n, dp));
        for(int  i = 0; i<dp.length;i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();

        System.out.println(fibTab(n));
    }


    
}
