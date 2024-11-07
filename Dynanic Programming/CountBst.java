public class CountBst {
    private static int countBST(int nodes) {
        int dp[] = new int[nodes+1];
        dp[0] =1;
        dp[1]= 1;

        for(int i = 2; i<nodes+1;i++){
            for(int j = 0; j<i;j++){
                int leftSubtreeNodes = dp[j];
                int rightSubtreeNodes = dp[i-j-1];
                dp[i] += leftSubtreeNodes*rightSubtreeNodes;
            }
        }
        return dp[nodes];
    }
    public static void main(String[] args) {
        int nodes = 5;
        System.out.println(countBST(nodes));
    }

    
}
