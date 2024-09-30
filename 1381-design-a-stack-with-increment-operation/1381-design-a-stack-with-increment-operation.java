class CustomStack {
    int[] s;
    int i;
    public CustomStack(int maxSize) {
        s=new int[maxSize];
        i=-1;
    }
    
    public void push(int x) {
        if(i<s.length-1){
            s[++i]=x;
            
        }
    }
    
    public int pop() {
        if(i>=0){
            return s[i--];
            
        }else{
            //System.out.println("Stack is empty");
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        int lim=Math.min(k,i+1);
        for(int i=0;i<lim;i++){
            s[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */