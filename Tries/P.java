import java.util.*;

public class P {
     //create a function for determining the day of the week for a given date keep in mid whether it is leap year or not
    public static String dayOfWeek(int day, int month, int year){
        int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};
        year -= (month < 3) ? 1 : 0;
        int dayOfWeek = (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return days[dayOfWeek];
    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
         int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            System.out.println(dayOfWeek(day, month, year));

    }
}
