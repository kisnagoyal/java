public class TilingProblem{

    public static int totalWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        // horizontal ways
        int fnm2 = totalWays(n-2);
        int fnm1 = totalWays(n-1);
        int total = fnm1 + fnm2;
        return total;
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println("total no of ways is/are " + totalWays(n));
        
    }
}