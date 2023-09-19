class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> s=new HashSet<>();
        
        for(Integer i:nums){
            s.add(i);
        }
        if(nums.length>s.size()){
            return true;
        }
        else{
            return false;
        }
        
       
    }
}