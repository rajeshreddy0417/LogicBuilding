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
    public boolean isValidBST(TreeNode root) {
        return fun(root,null,null);
    }
    public static boolean fun(TreeNode node,Integer min,Integer max){
        if(node==null){
            return true;
        }
        if(min!=null && node.val>=min || max!=null && node.val<=max){
            return false;
        }
        return fun(node.left,node.val,max)&& fun(node.right,min,node.val);
    }
}