class Solution {
    public void moveZeroes(int[] nums) {
       // Arrays.sort(nums);
        int x=0;
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                n[x]=nums[i];
                System.out.println(n[x]);
                x++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=n[i];
        }
        
        
        
        System.out.println(Arrays.toString(nums));
        
    }
}