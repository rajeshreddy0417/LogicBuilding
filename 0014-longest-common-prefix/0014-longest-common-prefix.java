class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n=Integer.MAX_VALUE;
        int l=0;
        for(int i=0;i<strs.length;i++){
            n=Math.min(n,strs[i].length());
        }
        Arrays.sort(strs);

        int i=0;
        while(i<n){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        if(strs.length==0){
                    return ""; 
                }
                else{
                    return strs[0].substring(0,i);
                }
        
        
    }
}