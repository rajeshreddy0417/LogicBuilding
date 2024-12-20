class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                    hm.put(nums[i],hm.get(nums[i])+1);
                }
        }
            // else{
            for(Map.Entry<Integer,Integer> i:hm.entrySet()){
                if(i.getValue()>nums.length/3){
                    ans.add(i.getKey());
                }
            }
                
            //}
        
        return ans;
    }
}