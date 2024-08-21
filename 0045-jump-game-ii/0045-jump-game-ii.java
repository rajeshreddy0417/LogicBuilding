class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int ind=0;
        int count=0;
        int end=0;
        for(int i=0;i<n-1;i++){
            if(ind<i+nums[i]){
                ind=i+nums[i];
            }
            //ind=Math.max(ind,i+nums[i]);
            if(i==end){
                count++;
                end=ind;
            }
        }
        return count;
    }
}