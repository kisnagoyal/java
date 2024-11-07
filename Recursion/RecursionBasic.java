public class RecursionBasic{
    public static void decreasing(int n){
        System.out.print(n + " ");
        if(n ==0){
            return;
        }
        decreasing(n-1);        
    }

    public static void increasing(int n){
        if (n == 1){
            System.out.print(1+ " ");
            return;
        }
        increasing(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){  // space and time complexity O(n), O(n);
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact = n*fnm1;
        return fact;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int x = sum(n-1);
        int sum = x + n;
        return sum;
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
       }
       if(n==1){
        return 1;
       }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fib = fibnm1 + fibnm2;
        // System.out.print(fib + " ");
        return fib;
    }



    public static void main(String[] args){
        int n = 8;
        int fact = factorial(n);
        // System.out.println(fact);
        // System.out.println(sum(n));
        System.out.println(fibonacci(n));
    }
}