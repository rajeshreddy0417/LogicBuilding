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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        TreeNode node=root;
        int ans[]=new int[]{1};
        fun(node,1,ans);
        return ans[0];
    }
    public void fun(TreeNode node,int hei,int[] ans){
        if(node==null){
            return;
        }
        ans[0]=Math.max(ans[0],hei);
        fun(node.left,hei+1,ans);
        fun(node.right,hei+1,ans);
        //return ans;
    }
}