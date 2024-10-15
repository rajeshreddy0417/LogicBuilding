class Solution {
    public long minimumSteps(String s) {
        int wc=0;
        long t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                t+=i-wc;
                wc++;
            }
        }
        return t;
    }
}