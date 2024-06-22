class Solution {
    public int minOperations(int[] nums) {
        
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            if(dp[i-1]%2==0){
                if(nums[i-1]==1){
                    dp[i]=dp[i-1];
                }
                else{
                    dp[i]=dp[i-1]+1;
                }
            }else{
                if(nums[i-1]==1){
                    dp[i]=dp[i-1]+1;
                }
                else{
                    dp[i]=dp[i-1];
                }
            }
        }
        return dp[dp.length-1];
    }
}