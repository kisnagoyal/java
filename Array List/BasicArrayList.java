import java.util.ArrayList;
import java.util.Collections;
public class BasicArrayList {

    public static void swap(ArrayList<Integer> list1, int i1, int i2){
        int temp = list1.get(i1);
        list1.set(i1,list1.get(i2));
        list1.set(i2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);

        list1.add(2);
        list2.add(2);

        list1.add(3);
        list2.add(3);

        list1.add(4);
        list2.add(4);

        list1.add(5);
        list2.add(5);

        list1.remove(2);
        list2.remove(2);


        list1.add(1,10);
        list2.add(1,10);

        //sorting
        Collections.sort(list1); //in ascending order
        Collections.sort(list2,  Collections.reverseOrder());

        System.out.println(list1);
        // System.out.println(list2);
        // System.out.println(list1.contains(111));

        // for(int i = 0; i< list1.size();i++){
        //     System.out.print(list1.get(i) + " ");
        // }

        //swap
        swap(list1, 1, 4);
        System.out.println(list1);

        
    }
}
