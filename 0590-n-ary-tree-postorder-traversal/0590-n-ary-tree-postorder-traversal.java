/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        fun(root,ans);
        return ans;
    }
    public static void fun(Node node,List<Integer> ans){
        if(node==null){
            return;
        }
        //Node chi;
        for(Node chi:node.children){
            fun(chi,ans);
        }
        //Node left=fun(node.children,ans);
        //Node right=fun(node.right,ans);
        ans.add(node.val);
        
    }
}