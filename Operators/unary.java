import java.util.*;
public class unary{
    public static void main(String args[]){
        int a = 10;
    //     System.out.print("a =")   ;        
    //     int b = ++a;                                // ++a means pre increment in which value is changed first then value used
    //     System.out.println(a);
    //    System.out.print("b = ");
    //    System.out.println(b);


        int c = a++;                               // a++ means post increment in which value is used first then changed
        System.out.println("c = " + c);
       System.out.println(a);
    }
}