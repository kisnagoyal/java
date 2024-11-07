import java.util.*;
public class assignment{
    public static void main(String args[]){
        Scanner kisna = new Scanner (System.in);
        int b = kisna.nextInt();
            b += 10;                                              //  b += 10 : b = b + 10;
        System.out.println("b = " + b);   
        b -= 30;                                                  // b -= 30 : b = b- 30;
        System.out.println("b = " + b);                            
                                                                  // similarly for *= and /=        
    }
}