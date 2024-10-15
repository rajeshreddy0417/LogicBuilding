class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        fun(ans,curr,1,n,k);
        return ans;
    }
    public static void fun(List<List<Integer>> ans,List<Integer> curr,int start,int n,int k){
        if(k==0){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            fun(ans,curr,i+1,n,k-1);
            curr.remove(curr.size()-1);
        }
    }
}