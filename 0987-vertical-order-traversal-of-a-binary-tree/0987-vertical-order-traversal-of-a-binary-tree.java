/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    //int pos;
    int row;
    int col;
    int val;
    public Pair(int val,int row,int col){
        this.val=val;
        //this.pos=pos;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> {
            if (x.col == y.col) {
                if (x.row == y.row) {
                    return x.val - y.val; 
                }
                return x.row - y.row;
            }
            return x.col - y.col;
        }); 
        //pq.add(new Pair(root.val,0,0));
        fun(root,0,0,pq);
        TreeMap<Integer,List<Integer>> hm=new TreeMap<>();
        //int len=pq.size();
        while(!pq.isEmpty()){
            Pair temp=pq.poll();
            int c=temp.col;
            //int r=temp.row;
            if(!hm.containsKey(c)){
                List<Integer> al=new ArrayList<>();
                al.add(temp.val);
                hm.put(c,al);
            }
            else{
                hm.get(c).add(temp.val);
            }
        }
        
        for(Map.Entry<Integer,List<Integer>> i:hm.entrySet()){
            ans.add(i.getValue());
        }
        return ans;
        
    }
    
    public static void fun(TreeNode node,int row,int col,PriorityQueue<Pair> pq){
        if(node==null){
            return;
        }
        pq.add(new Pair(node.val,row,col));
        if(node.left!=null){
            fun(node.left,row+1,col-1,pq);
        }
        if(node.right!=null){
            fun(node.right,row+1,col+1,pq);
        }
    }
}

















