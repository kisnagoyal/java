import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if(n == 2){System.out.println(" no. is prime");}
        else{
        for(int i=2; i<= n-1; i++){
         if(n%i == 0){ isprime = false;
            }
            }
            if(isprime == false){
                System.out.println("no is composite");}
            else {
                    System.out.println("no. is prime");
                }
            
    }
}}