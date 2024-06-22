class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l=0;
        int r=0;
        int max=0;
        int count=0;
        int temp=0;
        
        while(r<nums.length){
            if(nums[r]%2==1){
                count++;
                temp=0;
            }
            
            while(count==k){
                temp++;
                if(nums[l]%2==1){
                    count--;
                }
                l++;
                
            }
            max=max+temp;
            r++;
        }
        return max;
    }
}