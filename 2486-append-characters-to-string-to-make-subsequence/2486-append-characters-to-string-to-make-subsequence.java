class Solution {
    public int appendCharacters(String s, String t) {
        
        int ind=0;
        
        for(int i=0;i<s.length();i++){
            if(ind==t.length()){
                return 0;
            }
            if(s.charAt(i)==t.charAt(ind)){
                ind++;
            }
        }
        
            return t.length()-ind;
        
        
    }
}