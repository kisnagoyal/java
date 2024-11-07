import java.util.ArrayList;

public class MultiDimensional {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 0; i<= 5; i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }

        mainList.add(list1);
        mainList.add(list2);                            //size of list1 list 2 list3 need not to be same;
        mainList.add(list3);
        System.out.println(mainList);

        for(int i = 0; i< mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j< currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
