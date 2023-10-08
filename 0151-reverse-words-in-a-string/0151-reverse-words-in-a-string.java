class Solution {
    
    public String reverseWords(String s) {
        String ans="";
        String s1=s.trim();
        //System.out.println(s1);
       String[] split=s1.split("\\s+");
        
        int l=split.length;
        String[] rev=new String[l];
        for(int i=0;i<l;i++){
             rev[i]=split[l-1-i];
        }
        

        for(int i=0;i<l;i++){
            
            ans=ans+rev[i]+" ";
        }
        //System.out.println(ans);
        int anslen=ans.length();
        String finans=ans.substring(0, anslen-1);
        
        
        return finans;
    }
}