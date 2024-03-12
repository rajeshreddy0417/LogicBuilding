class Solution {
    public List<String> generateParenthesis(int n) {
        return fun("",n,n,new ArrayList<String>());
    }
    
    public static List<String> fun(String p,int open,int close,ArrayList<String> list){
        if(open==0 && close==0){
            list.add(p);
            return list;
        }
        if(open!=0){
            fun(p+"(",open-1,close,list);
        }
        if(close>open){
            fun(p+")",open,close-1,list);
        }
        return list;
    }  
}