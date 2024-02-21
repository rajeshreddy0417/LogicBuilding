class Solution {
    public int missingNumber(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int sum1=fun(nums.length,0);
        return sum1-sum;
        
    }
    public int fun(int num,int sum1){
        
        while(num>=0){
            sum1=sum1+num;
            num--;
        }
        return sum1;
        
    }
}