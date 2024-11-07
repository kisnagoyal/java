import java.util.ArrayList;
import java.util.Collections;

public class Homework{

    public static boolean monotonic(ArrayList<Integer> list){
        if(list.get(0) <list.get(1)){
            for(int i = 1; i< list.size()-1;i++){
                if(list.get(i) > list.get(i+1)){
                    return false;
                }
            }
        }
        else{
            for(int i = 0; i< list.size()-1;i++){
                if(list.get(i) < list.get(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static ArrayList lonely(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.sort(list);

        if(list.get(0) != list.get(1) && list.get(1) != list.get(0)+1){
            list1.add(list.get(0));
        }

        for(int i = 1; i< list.size()-1;i++){
            if(list.get(i) != list.get(i+1) && list.get(i) != list.get(i-1) && list.get(i+1) != list.get(i)+1 && list.get(i-1) != list.get(i)-1){
                list1.add(list.get(i));
            }
        }
        if(list.get(list.size()-1) != list.get(list.size()-2) && list.get(list.size()-1) != list.get(list.size()-2)+1){
            list1.add(list.get(list.size()-1));
        }
        return list1;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        // System.out.println(monotonic(list));

        System.out.println(lonely(list));
    }
}

