import java.util.*;
public class func1{
 //FUNCTION 1   
public static int sum(int b){
        int sum = 0;
        while(b>0){
            int c = b%10;
            sum = sum + c;
            b/=10;
            }
             System.out.println(sum);
            return sum;
           
        
    }
    //FUNCTION 2
    public static int max(int a,int b,int c){
        int max = 0;
        if(a>b ){
            if(a>c){
                max +=a;
            System.out.println(max);}
            else{
                max+=c;
                System.out.println(max);
            }}
        else{
            if(b>c){
                max+=b;
                System.out.println(max);}
            else{ 
                max+=c;
                System.out.println(max);}
        } 
        return max;
        }
    //FUNCTION 3
        public static int avg(int a, int b, int c){
            int avg = (a+b+c)/3;
            return avg;
        }
    //FUNCTION 4
    public static  String isEven(int b){
       String flag = "odd";
        if(b%2 ==0){
            flag = "even";}
            System.out.println(flag);
      return flag;
        }
        //Fuction 5
        public static String palindrome(int a){
            int sum =0;
            int A = a;
            String k = "yes";
          while(a>0){
           int c = a%10;
           sum = sum*10 + c;
           a/=10;
          }
          if (sum!=A){
            k = "no"; }
            System.out.println(A + ": "+ k);
            return k;
        }
    //MAIN FUNCTION
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      // int b = sc.nextInt();
     //  int c = sc.nextInt();
       // System.out.println(avg(a, b, c));
   // System.out.println(max(a,b,c));
//    isEven(a);
   palindrome(a);
// sum(a);
  
}}