import java.util.*;
public class reverse2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int a = sc.nextInt();
        int e = a;
        while(a>0){
            int c = a%10;
            rev = (rev*10) + c;
            a= (int)a/10;
            
        }System.out.print(rev);
        int d = rev - e;
        System.out.println("diff: " + d);
    }
}