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
    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root,false);
    }
    int fun(TreeNode node,boolean flag){
        int ans=0;
        if(flag && node.left==null && node.right==null){
            ans=ans+node.val;
            return node.val;
        }
        int left=0,right=0;
        if(node.left!=null){
            left=left+fun(node.left,true);
        }
        if(node.right!=null){
            right=right+fun(node.right,false);
        }
        return left+right;
    }
}