class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        fun(nums,0,ans,curr);
        return ans;
    }
    public static void fun(int[] nums,int ind,List<List<Integer>> ans,List<Integer> curr){
        //List<Integer> curr=new ArrayList<>();
        if(ind==nums.length){
            ans.add(new ArrayList<>(curr));
            //curr.clear();
            return ;
        }
        fun(nums,ind+1,ans,curr);
        curr.add(nums[ind]);
        fun(nums,ind+1,ans,curr);
        curr.remove(curr.size()-1);
        //return;
        //return ans;
    }
}