import java.util.*;

public class  UnionIntersection{
    public static ArrayList<Integer> union(int arr1[], int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i< arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i = 0; i< arr2.length;i++){
            hs.add(arr2[i]);
        }
        for(Integer i : hs){
            ans.add(i);
        }
        return ans;
    }
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]){
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i< arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i = 0; i< arr2.length;i++){
            if(hs.contains(arr2[i])){
                ans.add(arr2[i]);
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("your count is " + count);
        System.out.println(hs.size());
        return ans;
    }
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(union(arr1, arr2).size());
        System.out.println();
        System.out.println(intersection(arr1, arr2));
    }
}