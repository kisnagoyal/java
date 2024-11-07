import java.util.ArrayList;

public class PairSum {

    public static boolean PairSumOne(ArrayList<Integer> list,int target ){// can be solved using brute force also;  //o(n);
        int lp = 0;
        int rp = list.size()-1;
        while(lp !=rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static boolean PairSumTwo(ArrayList<Integer> list2, int target){ //o(n)
        int lp = 0;
        int rp = 0;
        for(int i = 0; i< list2.size()-1;i++){
            if(list2.get(i) > list2.get(i+1)){
                 lp = i+1;
                 rp = i;
                 break;
            }
        }
        System.out.println(lp + " " + rp);
        while(lp!= rp){
            if(list2.get(lp) + list2.get(rp) == target){
                return true;
            }
            else if(list2.get(lp) + list2.get(rp) < target){
                lp = (lp+1)% list2.size();
            }
            else{
                rp = (list2.size() + rp-1)% list2.size();
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); //sorted
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(PairSumOne(list,11));

        ArrayList<Integer> list2 = new ArrayList<>(); //sorted and rotated
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println(PairSumTwo(list2,26));
    }
}
