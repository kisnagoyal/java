public class character{
    public static void main(String agrs[]){
        char c = 'A';
        for(int i=1; i<=4;i++){
            for(int j =1; j <=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println(' ');
        }
    }
}