class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }            
        s=s.toLowerCase();
        System.out.println(s);
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(!Character.isLetterOrDigit(s.charAt(l)) && l<s.length()){
                l++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(r)) && r>0){
                r--;
            }
            else{
           
                if(s.charAt(l)!=s.charAt(r)){
                    return false;
                
            }
            l++;
            r--;
        }       
        }  
        return true;
    }
}