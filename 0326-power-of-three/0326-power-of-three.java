class Solution {
    public boolean isPowerOfThree(int n) {
        return fun(n);
    }
    public static boolean fun(int num){
        if(num==1){
            return true;
        }
        
        if(num%3!=0 || num==0){
            return false;
        }
        return fun(num/3);
    }
}