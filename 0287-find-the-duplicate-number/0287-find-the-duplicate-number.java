class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        int res=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                res=nums[i];
            }
        }
        
        
        
        return res;
    }
}