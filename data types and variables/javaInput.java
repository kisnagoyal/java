import java.util.*;
public class javaInput{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //String input= sc.next();
       // System.out.println(input);
      //  String name = sc.nextLine();// nextLine is used to print after space
       // System.out.println(name);
       // int integer= sc.nextInt();//nextInt is used to print no.
       // System.out.println(integer);
        //boolean isit= sc.nextBoolean();
       // System.out.println(isit);
       // SUM OF a and b
       int a= sc.nextInt();
       int b= sc.nextInt();
       int sum= a + b;
       System.out.println(sum);
       // AREA OF CIRCLE
       float r= sc.nextFloat();
       float area= 3.14f * r * r;
       System.out.println(area);
    }
}