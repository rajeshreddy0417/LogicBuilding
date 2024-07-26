class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=1;i<=nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                if(nums[i-1]+nums[j-1]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}