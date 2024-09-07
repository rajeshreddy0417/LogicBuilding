class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int max=nums[0];
        
        int fin=nums[0];
        for(int i=1;i<n;++i){
            max=Math.max(max+nums[i],nums[i]);
            fin=Math.max(fin,max);
        }
        return fin;
    }
}