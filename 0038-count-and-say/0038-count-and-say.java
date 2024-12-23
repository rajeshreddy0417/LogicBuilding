class Solution {
    public String countAndSay(int n) {
        
        //int k=n;
        String s="1";
        
        while(n>1){
            String temp="";
            int c=1;
            for(int i=0;i<s.length();i++){
                
                if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                    c++;
                }
                else{
                    temp+=Integer.toString(c)+s.charAt(i);
                    c=1;
                }
            }
            s=temp;
            n--;
        }
        return s;
    }
}