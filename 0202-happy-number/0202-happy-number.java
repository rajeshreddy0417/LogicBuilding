class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        
        do{
            slow=sqr(slow);
            fast=sqr(sqr(fast));
        }while(slow!=fast);
        
        if(slow==1){
            return true;
        }
        return false;
    }
    
    public int sqr(int n){
        int ans=0;
        while(n>0){
            int temp=n%10;
            ans=ans+temp*temp;
            n=n/10;
        }
        return ans;
    }
}