public class LCSubstring { // )(n*m)
    public static int findLcsTab(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return ans;
    }
    
    //finding lcs using recursion brute force
    public static int findLCSUsingBruteForce(String s1, String s2, int n, int m, int count) {
        if (n == 0 || m == 0) {
            return count;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)){
            count =  findLCSUsingBruteForce(s1, s2, n-1, m-1, count+1);
            return count;
        }
        count = Math.max(count,Math.max(findLCSUsingBruteForce(s1, s2, n-1, m, 0),findLCSUsingBruteForce(s1, s2, n, m-1, 0)));
        return count;
        
    }

    //using memoization
    public static int findLCSUsingMemoization(String s1, String s2, int n, int m, int dp[][], int count) {
        if (n == 0 || m == 0) {
            return count;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)){
            count =  findLCSUsingBruteForce(s1, s2, n-1, m-1, count+1);
            return count;
        }
        count = Math.max(count,Math.max(findLCSUsingMemoization(s1, s2, n-1, m,dp, 0),findLCSUsingMemoization(s1, s2, n, m-1,dp, 0)));
        return count;
    }
    //create a function to make given string palindrome by deleting minimum number of characters 
    //from the string
    //find the length of longest palindromic subsequence
    //then subtract the length of longest palindromic subsequence from the length of the string
    //to get the minimum number of characters to be deleted
    public static int minDeletionsToMakePalindrome(String s1) {
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        int lcs = findLcsTab(s1, s2);
        return s1.length() - lcs;
    }


    

    public static void main(String[] args) {
        // String s1 = "ABFCE";
        // String s2 = "ABCD";
        String s1 = "babad";
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();

        System.out.println(findLcsTab(s1, s2));
        // System.out.println(findLCSUsingBruteForce(s1, s2, s1.length(), s2.length(), 0));

        int dp[][] = new int[s1.length()+1][s2.length()+1];
        int n = s1.length()+1;
        int m = s2.length()+1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                dp[i][j] = -1;
            }
        }

        // System.out.println(findLCSUsingMemoization(s1, s2, n-1, m-1, dp, 0));

    }
}




