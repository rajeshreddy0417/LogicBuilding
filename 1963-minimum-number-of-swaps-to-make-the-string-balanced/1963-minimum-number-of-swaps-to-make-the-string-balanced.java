class Solution {
    public int minSwaps(String s) {
        if(s.length()==0){
            return 0;
        }
        int count=0;
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                stack.push('[');
            }
            else{
                if(stack.size()!=0 ){
                    stack.pop();
                }
                else{
                    count++;
                }
            }
            
        }
        return (count+1)/2;
    }
}