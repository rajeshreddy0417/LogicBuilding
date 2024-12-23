class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int len=s.length();
        int[][] dp=new int[len][len];
        String ans="";
        int maxx=0;
        for(int diff=0;diff<len;diff++){
            for(int i=0;i+diff<len;i++){
                int j=i+diff;
                if(i==j){
                    dp[i][i]=1;
                }
                else if(diff==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=2;
                    }else{
                        dp[i][j]=0;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0){
                        dp[i][j]=dp[i+1][j-1]+2;
                    }else{
                        dp[i][j]=0;
                    }
                }
                if(dp[i][j]>0){
                    if(dp[i][j]>maxx){
                        maxx=dp[i][j];
                        ans=s.substring(i,j+1);
                        
                    }
                }
                
            }
        }
        return ans;
    }
}