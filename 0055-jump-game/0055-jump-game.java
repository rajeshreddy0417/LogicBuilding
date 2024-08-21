class Solution {
    public boolean canJump(int[] nums) {
        //int n=nums.length;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(i>ind){
                return false;
            }
            ind=Math.max(ind,i+nums[i]);
            
        }
        return true;
    }
}