import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       int a= 1;
       int n= sc.nextInt();
       int sum=0;
        while(a<n){
            sum = sum+ a;
            a++;

        }
        System.out.print(sum);
    }
}