import java.util.*;
public class BREAK{
    public static void main(String args[]){
       Scanner s= new Scanner(System.in);
      
       do{  
        System.out.print("enter your number=");
        int a=s.nextInt();
       if(a%10 == 0){break;}
       System.out.println(a);

       }while(true);
    }
}