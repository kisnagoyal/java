import java.util.*;
public class update{
    public static void update(int marks[]){
        for(int i=0; i < marks.length;i++){
            marks[i] = marks[i]+ 1;
}
    }
    public static int getLargest(int marks[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < marks.length;i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        return max;
    }



    public static void main(String args[]){
     int marks[]= {97,98,99};
     System.out.println(getLargest(marks));
     update(marks);
     for(int i =0;i < marks.length; i++){
       System.out.print(marks[i]+" ");
     }
    System.out.println();
   




    }}