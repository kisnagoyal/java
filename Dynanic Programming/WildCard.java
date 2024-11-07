public class WildCard {
    public static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;
        for(int i = 1; i<dp.length;i++){
            dp[i][0] = false;
        }

        for(int j = 1; j<dp[0].length;j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }//else false
        }

        //bottom up
        for(int i = 1; i<dp.length;i++){
            for(int j = 1; j<dp[0].length;j++){
                //case -> ith char == jth char || jth char == ?
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s  = "abcd";
        String p = "**fb";

        System.out.println(isMatch(s, p));
    }
}