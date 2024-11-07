public class MinimumPartition {
    private static int findMinDiff(int[] numbers) {
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){
             sum += numbers[i];
        }
        int W = sum/2;

        int dp[][] = new int[numbers.length+1][W+1];
        
        for(int i = 1; i<dp.length;i++){
            for(int j = 1; j<dp[0].length;j++){
                if(numbers[i-1] <= j){
                    int incl = numbers[i-1] + dp[i-1][j-numbers[i-1]];
                    int excl = dp[i-1][j];
                    dp[i][j] = Math.max(incl, excl);
                }
                else{
                    dp[i][j] = dp[i-1][j];;
                }
            }
        }
        int sum1 = dp[numbers.length][W];
        int sum2 = sum - dp[numbers.length][W];  
        return Math.abs(sum2 - sum1);
    }
    public static void main(String[] args) {
        int numbers[] = {1,6,11,5};
        
        System.out.println(findMinDiff(numbers));
    }

    
}
