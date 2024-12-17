class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<>();
        if(numRows>=1){
            ArrayList<Integer> cur=new ArrayList<>();
            cur.add(1);
            al.add(cur);
        }
        if(numRows>=2){
            ArrayList<Integer> cur=new ArrayList<>();
            cur.add(1);
            cur.add(1);
            al.add(cur);
        }
        for(int i=2;i<numRows;i++){
            ArrayList<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<al.get(i-1).size();j++){
                curr.add(al.get(i-1).get(j-1)+al.get(i-1).get(j));
            }           
            curr.add(1);
            al.add(curr);
        }
        return al;
    }
}