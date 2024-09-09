class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int sol=fun(coins,amount,coins.length-1,dp);
        
        if(sol==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return sol;
        }
    }
    public static int fun(int[] nums,int tar,int ind,int[][] dp){
        int ans=Integer.MAX_VALUE;
        if(ind==0){
            if(tar%nums[0]==0){
                return (tar/nums[0]);
            }else{
                return Integer.MAX_VALUE;
            }
        }
        if(tar==0){
            return 0;
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        int nottake=fun(nums,tar,ind-1,dp);
        int take=Integer.MAX_VALUE;
        if(tar>=nums[ind]){
            int res=fun(nums,tar-nums[ind],ind,dp);
            if(res!=Integer.MAX_VALUE){
                take=1+res;
            }
        }
        return dp[ind][tar]=Math.min(take,nottake);
    }
}