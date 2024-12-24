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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        fun(root,ans);
        return ans;
    }
    public static void fun(TreeNode node,List<Integer> ans){
        if(node==null){
            return ;
        }
        if(node.left!=null){
            fun(node.left,ans);
        }
        ans.add(node.val);
        if(node.right!=null){
            fun(node.right,ans);
        }
        
    }
}