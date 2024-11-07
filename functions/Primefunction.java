import java.util.*;
public class Primefunction{
    public static boolean prime(int a){
        if(a == 2){
            return true;
        }
        for(int i =2;i<= Math.sqrt(a);i++){
            if(a % i == 0){
                return false;
                
            }
    }
    return true;
    }
    public static void rangeOfPrime(int a){
        for(int i =2;i<=a;i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void binToDec(int bin){
        int pow = 0;
        int decnum = 0;
        int mynum = bin;
        while(bin >0){
        int lastDigit = bin % 10;
        decnum = decnum + (int)(lastDigit*Math.pow(2,pow));
        bin = (int)bin / 10;
        pow++;

    }
    System.out.print("mynum:"+ mynum + "  decimal:" + decnum );
    }

    public static void decToBin(int dec){
        int pow = 0;
        int binNum = 0;
        while(dec >0){
            int rem = dec%2;
            binNum = binNum + (rem*(int)Math.pow(10,pow));
            pow++;
            dec /= 2;
        }
        System.out.println(binNum);
    }
    public static void main(String args[]){
     // boolean c=  prime(5);
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     //rangeOfPrime(a);
    //  binToDec(101);
    decToBin(a);



    }
}