class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int l=l1+l2;
        double sol=0;
        int[] arr=new int[l];
        for(int i=0;i<l1;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<l2;i++){
            arr[l1+i]=nums2[i];
        }
        Arrays.sort(arr);
       
        if(l%2!=0){
            int z=l/2;
            sol=arr[z];
        }
        else{
            int x=(l/2);
            sol=(arr[x-1]+arr[x])/2.0;
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(sol);
        
        return sol;
    }
}