class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                ind=i;
                max=nums[i];
            }
        }
        return ind;
    }
}