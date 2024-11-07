public class LCS {
    private static int findLcs(String str1, String str2, int n, int m) {
        if(m == 0 || n == 0){
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return findLcs(str1, str2, n-1, m-1) +1;
        }
        else{
            int ans1 = findLcs(str1, str2, n-1, m);
            int ans2 = findLcs(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
    private static int findLcsmemo(String str1, String str2, int n, int m,int dp[][]) {
        if(m == 0 || n == 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m]= findLcs(str1, str2, n-1, m-1) +1;
            return dp[n][m];
        }
        else{
            int ans1 = findLcsmemo(str1, str2, n-1, m,dp);
            int ans2 = findLcsmemo(str1, str2, n, m-1,dp);
            dp[n][m]= Math.max(ans1, ans2);

            return dp[n][m];
        }
    }
    public static int findLcsTabu(String str1,String str2,int n,int m){
        int dp[][] = new int[n+1][m+1];
        String str = "";
        //initialization by default

        for(int i =1; i<dp.length;i++){
            for(int j =1; j<dp[0].length;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                    if(i == j){
                        str += str1.charAt(i-1); //hope it is right check once...
                    }
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        System.out.println(str);
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i<n+1;i++){
            for(int j = 0; j<m+1;j++){
                dp[i][j] = -1;     
            }
        }

        System.out.println(findLcs(str1,str2,str1.length(),str2.length()));

        System.out.println(findLcsmemo(str1,str2,n,m,dp));

        System.out.println(findLcsTabu(str1, str2, n, m));
    }

    
}
