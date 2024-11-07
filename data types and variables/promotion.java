import java.util.*;
public class promotion{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
       int c =  b + a;                                       // b is converted into int and then a is also converted into int because of type promotion
        System.out.println((int)b);                          // type casting
        System.out.println((int)a);                          // type casting
        System.out.println(b - a);                           // type promotion
        System.out.println(c);


    }
}