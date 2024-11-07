public class RecursionProblems {

    public static int power(int x, int n){ // time colplexity O(n)
        if(n == 0){
            return 1;
        }
        int ans = x * (power(x, n-1));
        return ans;
    }

    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPow = optimizedPower(x, n/2);
        int halfpowesq = halfPow *halfPow;
        if(n%2 !=0){
            halfpowesq = x* halfpowesq;
        }
        
        return halfpowesq;
    }

    public static void main(String args[]){
        int x = 2;
        int n = 6;
        System.out.println(power(x, n));
        System.out.println(optimizedPower(x, n));

    }
}
