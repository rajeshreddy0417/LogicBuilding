class Solution {
    public int longestPalindromeSubseq(String s) {
        int l=s.length();
        String rev="";
        for(int i=0;i<l;i++){
            rev=s.charAt(i)+rev;
        }
        System.out.println(rev);
        int[][] dp=new int[l+1][l+1];
        for(int i=0;i<=l;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=l;j++){
            dp[0][j]=0;
        }
        //int max=0;
        for(int i=1;i<=l;i++){
            for(int j=1;j<=l;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    //max=Math.max(max,dp[i][j]);
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[l][l];
        
        
        
        
        
        
    }
//     public static int fun(String s,String r,int l,int[][] dp,int ind1,int ind2){
        
//     }
}