class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                list.add(nums[i]);
            }
        }
        System.out.println(Arrays.toString(nums));
        return list;
    }
}