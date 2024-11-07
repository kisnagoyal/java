public class RodCutting {

    public static int maxVal(int price[],int rodlen,int len[]){
        int dp[][] = new int[price.length +1][rodlen +1];
        //initialization is by default
        for(int i =1; i<dp.length;i++){
            for(int j =1; j<dp[0].length;j++){
                if(len[i-1] <= j){
                    int p1 = price[i-1] + dp[i][j-(len[i-1])];
                    int p2 = dp[i-1][j];
                   dp[i][j] = Math.max(p1, p2);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[price.length][rodlen];
        
    }
    public static void main(String[] args) {
        int len[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int rodlen = 8;

        System.out.println(maxVal(price, rodlen,len));
    }
}
