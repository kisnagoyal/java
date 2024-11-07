import java.util.*;
public class Problems {

    public static int minAbsDiff(int A[], int B[]){ //o(nlogn)
        Arrays.sort(A);
        Arrays.sort(B);
        int ans = 0;
        for(int i = 0 ; i< A.length;i++){
            ans += Math.abs(A[i]-B[i]);
        }
        return ans;
    }
    public static void main(String args[]){
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        
        System.out.println(minAbsDiff(A, B));


    }
}
