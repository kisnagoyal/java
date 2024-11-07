import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        // int a = 0;
        while(n>0){
         int a =  n%10;
            System.out.print(a);
          n=  n/10;
        }
    }
}