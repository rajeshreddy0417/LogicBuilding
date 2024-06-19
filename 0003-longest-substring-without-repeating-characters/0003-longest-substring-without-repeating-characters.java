class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int l=0;
        int r=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        while(r<s.length()){
        if(hm.containsKey(s.charAt(r))){
            l=Math.max(l,hm.get(s.charAt(r))+1);
        }
        hm.put(s.charAt(r),r);
            max=Math.max(max,r-l+1);
            
            r++;
    }
        return max;
}
}