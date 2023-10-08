class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        
        int sol[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count<2){
                al.add(nums[i]);
            }
        }
        
        
        
        
        
        
        
        System.out.println(al);
        int[] ans = new int[al.size()];
        for(int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}