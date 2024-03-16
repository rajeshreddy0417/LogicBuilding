class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> sa=new ArrayList<>();
        fun(nums,0,sa,a);  
        System.out.println(a);
        //System.out.prinytln(Arrays.toString(list.toArray(a)));
        return a;
    }
    
    public void fun(int[] arr,int i,List<Integer> sa,List<List<Integer>> a){
        if(i==arr.length){
            a.add(new ArrayList<Integer>(sa));
            return;
        }
        
        fun(arr,i+1,sa,a);
        sa.add(arr[i]);
        fun(arr,i+1,sa,a);
        sa.remove(sa.size()-1);
    }
}