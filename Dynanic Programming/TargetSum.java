public class TargetSum {
    public static void main(String[] args) {
        int numbers[] = {0,2,3,4};
        int TargetSum = 10;
        System.out.println(hasTargetSum(numbers,TargetSum));
    }

    private static boolean hasTargetSum(int[] numbers, int targetSum) {
        // TODO Auto-generated method stub
        boolean dp[][] = new boolean[numbers.length +1][targetSum +1];

        for(int i = 0; i<dp.length;i++){
            dp[i][0] = true;
        }

        for(int i = 1;i<dp.length;i++){
            for(int j =1;j<dp[0].length;j++){
                int v = numbers[i-1];
        
                if(v <= j && dp[i-1][j-v]){
                    dp[i][j] = true;
                }
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
                
            }
        }

        return dp[numbers.length][targetSum];
    }
}
