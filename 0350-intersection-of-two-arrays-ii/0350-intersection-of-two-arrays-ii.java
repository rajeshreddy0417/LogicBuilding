class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }
        }
        int[] fin=new int[ans.size()];
        for(int l=0;l<ans.size();l++)
        {
            System.out.println(ans.get(l));
            fin[l]=ans.get(l);
        }    
        return fin;
    }
}