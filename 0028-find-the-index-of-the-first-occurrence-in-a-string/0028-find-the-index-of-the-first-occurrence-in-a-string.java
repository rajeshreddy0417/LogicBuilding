class Solution {
    public int strStr(String s1, String s2) {
        if(s1.length()<s2.length()){
            return -1;
        }
        int ans=-1;
        for(int i=0;i<s1.length()-s2.length()+1;i++){
            if(s2.charAt(0)==s1.charAt(i)){
                ans=fun(s1,s2,i);
            }
            if(ans!=-1){
                return ans;
            }
        }
        return ans;
    }
    public int fun(String s1,String s2,int index){
        
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i+index)!=s2.charAt(i)){
                return -1;
            }
        }
        return index;
        
    }
}