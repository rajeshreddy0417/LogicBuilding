class Pair{
    int hei;
    int ind;
    public Pair(int hei,int ind){
        this.hei=hei;
        this.ind=ind;
    }
}
class Solution {
    public int largestRectangleArea(int[] hei) {
        int n=hei.length;
        if(n==0){
            return 0;
        }
        Stack<Pair> s=new Stack<>();
        
        int ans=0;
        int s1=0,s2=0;
        int i=0;
        // if(n>0){
        //     s.push(new Pair(hei[0],0));
        // }
        while(i<n){
            
            if(s.isEmpty() || s.peek().hei<=hei[i]){
                s.push(new Pair(hei[i],i));
                i++;
            }else{
                Pair p=s.pop();
                s1 =s.isEmpty() ? i : i - s.peek().ind - 1;
                s2=p.hei;
                ans=Math.max(ans,s1*s2);
            }
            
        }
        while(!s.isEmpty()){
            Pair p=s.pop();
            s1 =s.isEmpty() ? n : n - s.peek().ind - 1;
            s2=p.hei;
            ans=Math.max(ans,s1*s2);
        }
        //System.out.println(ans);
        return ans;
    }
}