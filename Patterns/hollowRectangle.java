import java.util.*;
public class hollowRectangle{
//for hollow rectangel
    public static void hollow_rectangle(int rows,int columns){
        //for outer loops
        for(int i =1; i<=rows; i++){
            //for inner loop
            for(int j=1;j<=columns;j++){
                if(i==1|| i== rows || j==1|| j==columns){
                    System.out.print('*');
                }
                else{System.out.print(" ");}
            }
            //System.out.println();
        }
    }
//inverted and rotated half pyramid
    public static void pyramid(int rows, int columns){
        for(int i =1;i <= rows; i++){
            for(int j =1; j <= rows - i;j++){
               System.out.print(" ");

            }
            for(int k =1; k <= i;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
//Inverted half pyramid with numbers
    public static void inverted_half_pyramid_with_numbers(int rows, int columns){
        for(int i=1; i<=rows; i++){
            for(int j =1; j<=rows -i +1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
//FLOYD's TRIANGLE
public static void floyd_triangle(int rows){
    int counter =1;
    for(int i=1; i<=rows;i++){
        for(int j =1;j<=i;j++){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
    }
}
// 0-1 triangle
public static void zero_one_triangle(int rows,int columns){
    for(int i=1;i <= rows;i++){
        for(int j =1; j<=i; j++){
            if((i+j)%2 ==0){System.out.print(1 + " ");}
            else{System.out.print(0+ " ");}
            
        }
        System.out.println();
    }
}

//main function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        hollow_rectangle(rows, columns);
     //  pyramid(rows,columns);
    // inverted_half_pyramid_with_numbers(rows,columns);
   // floyd_triangle(rows);
  // zero_one_triangle( rows,columns);
    }
}