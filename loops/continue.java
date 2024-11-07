import java.util.*;
public class Continue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         do{ int a= sc.nextInt();
            if(a%10 == 0){
                continue;}
                System.out.println(a);
            }while(true);
        
 }
}