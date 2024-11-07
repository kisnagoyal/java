import java.util.*;

public class Frog {    // DIY follow up jump with at most k jump
    public static int frogJump(int n, int heights[]){
        if(n == 0){
            return 0;
        }
        
        int l = frogJump(n-1, heights) + Math.abs(heights[n]- heights[n-1]);
        int r = Integer.MAX_VALUE;
        if(n >1)
        r = frogJump(n-2, heights) + Math.abs(heights[n]- heights[n-2]);
        
        return Math.min(l,r);
    }
    public static int frogJumpMemo(int n, int heights[],int dp[]){
        if(n == 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int l = frogJumpMemo(n-1, heights,dp) + Math.abs(heights[n]- heights[n-1]);
        int r = Integer.MAX_VALUE;
        if(n >1)
        r = frogJumpMemo(n-2, heights,dp) + Math.abs(heights[n]- heights[n-2]);
        
        return dp[n] = Math.min(l,r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  int t = sc.nextInt();
        //  while(t >0){
        //     int n = sc.nextInt();
        //     int nums[] = new int[n];
        //     for(int i = 0; i<n;i++){
        //         nums[i] = sc.nextInt();
        //     }
        //     System.out.println(frogJump(n-1, nums));
        //     t--;
        //  }

         //memo
         int nums[] = {10, 30, 40, 20};
         int dp[] = new int[nums.length];
         Arrays.fill(dp,-1);
         System.out.println(frogJumpMemo(nums.length-1, nums, dp));
         System.out.println(frogJump(nums.length-1, nums));

        
    }
}
