class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> al=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                al.add(sum);
                
            }
        }
        //System.out.println(al);
        Collections.sort(al);
        int sum=0;
        int mod=1000000007;
        //System.out.println(al);
        for(int i=left-1;i<right;i++){
            sum=(sum+al.get(i))%mod;
        }
        return sum;
    }
}