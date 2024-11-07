import java.util.*;
public class stringIntro{
    public static void printString(String fullname ){
        for(int i = 0; i < fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }






    public static void main(String args[]){
        char arr[] ={'a','b','c'};
        String str1 = "abcd";                              //str1 and str2 has same meaning for programmers
        String str2 = new String("xyz");

        //creating a string
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // //To find length
        // int length = name.length();
        // System.out.println(length);

        //concatenation
        String firstname ="kisna";
        String lastname = "goyal";
        String fullname = firstname + " " +  lastname;
        System.out.println(fullname);

        //to find indexes
        System.out.println(fullname.charAt(6));
        printString(fullname);
    }
}