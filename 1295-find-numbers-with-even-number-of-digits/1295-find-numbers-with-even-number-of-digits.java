class Solution {
    public int findNumbers(int[] nums) {
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<nums.length;i++){
            
            if((Integer.toString(nums[i]).length())%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return evencount;
    }
}