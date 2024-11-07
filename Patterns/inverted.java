public class inverted{
    public static void main(String args[]){
    /*for(int i=4;i>=1;i--){
        for(int j=i; j<=i && j >=1;j--){
            System.out.print('*');
        }
        System.out.println(' ');
    }*/
   int n=4;
    for(int i =0;i<4;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print('*');
        }
        System.out.println();
    }
}}