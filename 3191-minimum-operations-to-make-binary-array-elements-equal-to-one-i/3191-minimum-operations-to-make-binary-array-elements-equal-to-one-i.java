class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                count++;
                for(int j=i;j<i+3;j++){
                    if(nums[j]==0){
                        nums[j]=1;
                    }else{
                        nums[j]=0;
                    }
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                return -1;
            }
        }
        return count;
    }
}