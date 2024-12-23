class Solution {
    public int strStr(String b, String a) {
        int ans=-1;
        int ls1=a.length()-1;
        //System.out.println(b.substring(0,0+ls1+1));
        for(int i=0;i<b.length()-ls1;i++){
            if(b.substring(i,i+ls1+1).equals(a)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}