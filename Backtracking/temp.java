class Solution {
    public boolean canJump(int[] nums) {
        int i = -1;
        i += nums[0];
        else{
            boolean flag = true;
            while(flag){
                if(i == nums.length-1){
                    return true;
                }
            int j = i;
            i+= nums[i];
            if(j == i){
                flag = false;
            }
            if(i >= nums.length){
                flag = false;
            }
        } 
        return false;   
        }
          
    }
    public static void main(String args[]){
        
    }
}