import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // calculator
        System.out.println(" enter a =");
        int a= sc.nextInt();

        System.out.println("enter b =");
        long b = sc.nextLong();

        System.out.println("enter c = ");
        long c = sc.nextLong();

        System.out.println("enter operator =");
        int  operator = sc.nextInt();

      switch(operator){
        case 1 : System.out.println("Ans: " + (a + b + c)); break;
        case 2 : System.out.println("Ans: " + (-a + b + c)); break;
        case 3 : System.out.println("Ans: " + (a - b + c)); break;
        case 4 : System.out.println("Ans: " + (a + b - c)); break;
        case 5 : System.out.println("Ans: " + (- a -  b + c)); break; 
        case 6 : System.out.println("Ans: " + (a  - b - c)); break;
        case 7 : System.out.println("Ans: " +  (- a + b - c)); break;
        case 8 : System.out.println("Ans: " + (- a -  b -  c)); break;
        default : System.out.println(" binni pgal h isliye kaam nhi kr rha calculator");
      }
    }}