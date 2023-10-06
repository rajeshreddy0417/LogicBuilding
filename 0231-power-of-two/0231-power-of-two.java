class Solution {
    public boolean isPowerOfTwo(int n) {
        return fun(n);
    
    }
    public boolean fun(int num){
        if(num==1){
            return true;
        }
        
        if(num%2!=0 || num==0){
            return false;
        }
        return fun(num/2);
        
    }
}