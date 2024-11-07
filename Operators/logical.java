import java.util.*;
public class logical{
    public static void main(String args[]){
        int a = 21;
        int b = 39;
        int c = 4;
        int d = 34;
        System.out.println( a > b || b < c && c <a);    // &&: logical and ...... ||: logical or 
        System.out.println(!( a> b ));                  // !: logical not 
    }
}