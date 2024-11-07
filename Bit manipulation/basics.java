import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class basics{
    public static void isEven(int n){
        int BitMask = 1;
        if((n & BitMask) == 0){
            System.out.println("No. is even");
        }
        else{
            System.out.println("No. is odd");
        }
    }

    public static int getithbit(int n, int i){
        int BitMask = 1 <<i;
        if((n & BitMask) == 0){
            return 0;
        }
        return 1;
    }

    public static int setithbit(int n, int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }

    public static int clearithbit(int n, int i){
        int BitMask = ~(1 <<i);
        return (n & BitMask);
    }

    public static int updateithbit(int n, int i, int newBit){
        // METHOD 1
        // if(newBit == 0){
        //     return clearithbit(n,i);
        // }
        // else{
        //     return setithbit(n, i);
        // }
        n = clearithbit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearlastithbit(int n, int i){
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    public static int clearbitsinrange(int n,int i, int j){
        int a = (~0) << j +1;
        int b = (1<<i)-1;
        int BitMask = a|b;
        return n & BitMask;
    }

    public static boolean ispowerof2(int n){
        return (n & (n-1)) ==0;
    }

    public static int clearRangeOfBits(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = 1<<i -1;
        int Bitmask = a|b;
        return n & Bitmask;
    }

    public static int countsetbits(int n){
        int count = 0;
        while(n !=0){
            if((n & 1) != 0){
                count++;
            }
           n=  n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){ // check LSB
                ans = ans * a;
            }
            a = a* a;
            n= n>>1;
        }
       return ans;
    }

    public static void main(String args[]){
        // isEven(3);
        // isEven(4);
        // isEven(10);
        // isEven(5);
        // System.out.println(1<<2);                       just for fun...
        System.out.println(fastExpo(3,5));
    }
}