class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        
        int l1=v1.length;
        int l2=v2.length;
        //System.out.println(Arrays.toString(v1));
        int n=Math.max(l1,l2);
        for(int i=0;i<n;i++){
            int n1=(i<l1)?Integer.parseInt(v1[i]):0;
            int n2=i<l2?Integer.parseInt(v2[i]):0;
            
            if(n1>n2){
                return 1;
            }else if(n1<n2){
                return -1;
            }
        }
        return 0;
    }
}