public class StringConversion {
    public static int findingOperations(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int lcs = findLcsTabu(s1, s2, n, m);

        int deletion = n-lcs;
        int insertion = m-lcs;

        System.out.println("deletion : " + deletion);
        System.out.println("insertion : "+ insertion);
        return insertion + deletion;
    }
    public static int findLcsTabu(String str1,String str2,int n,int m){
        int dp[][] = new int[n+1][m+1];
        //initialization by default

        for(int i =1; i<dp.length;i++){
            for(int j =1; j<dp[0].length;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";

        System.out.println("total : " + findingOperations(s1, s2));
    }
}
