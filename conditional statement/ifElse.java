import java.util.*;
public class ifElse{
    public static void main(String args[]){
        /*Scanner sc = new Scanner (System.in);*/
        int a  = (int)21.7 ;
        int b = 20;
        if( a > b){System.out.println("a > b");} 
         else if (a == b){System.out.println("a = b");} 
        else if(a<b){System.out.println("b > a");}
        else{System.out.println("invalid output");}


        int age = 8;
        if (age < 13){System.out.println("bacha");}
        else if (age >= 13 && age < 19){System.out.println("teenager");}
        else{System.out.println("adult");}
    }
}