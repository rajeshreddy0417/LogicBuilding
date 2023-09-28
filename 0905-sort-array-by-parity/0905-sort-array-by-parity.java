class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int s=0;
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[s++]=nums[i];
            }
            else{
                arr[l--]=nums[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
        
        
        
    }
}