class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        int[] right=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>0;i--){
            right[i]=Math.max(right[i+1],nums[i]);
        }
        int l=0,r=0,max=0;
        while(r<n){
            while(l<r && nums[l]>right[r]){
                l++;
            }
            max=Math.max(max,r-l);
            r++;
        }
        return max;
    }
}