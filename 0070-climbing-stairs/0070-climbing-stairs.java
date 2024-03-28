//memoization
class Solution {
    public int climbStairs(int n) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        
        return fun(n,hm);
        
    }
    public int fun(int n,HashMap<Integer,Integer> hm){
        if(n==0 || n==1){
            return 1;
        }
        
        if(!hm.containsKey(n)){
            hm.put(n,fun(n-1,hm)+fun(n-2,hm));
        }
        return hm.get(n);
        
        
        
        
        
    }
}