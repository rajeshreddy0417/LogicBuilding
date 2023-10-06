class Solution {
    public boolean isPowerOfFour(int n) {
        return fun(n);
    }
    public static boolean fun(int num){
        if(num==1){
            return true;
        }
        
        if(num%4!=0 || num==0){
            return false;
        }
        return fun(num/4);
    }
}