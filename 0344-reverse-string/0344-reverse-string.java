class Solution {
    public void reverseString(char[] s) {
         rev(s,0,s.length-1);
         System.out.println(Arrays.toString(s));
    }
    public static char[] rev(char[] s,int start,int end){
        if(start>end){
            return s;
        }
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        
        rev(s,start+1,end-1);
        return s;
    }
}