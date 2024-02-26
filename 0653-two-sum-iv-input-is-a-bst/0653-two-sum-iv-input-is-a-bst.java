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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs=new HashSet<>();
        return helper(root,k,hs);
        
    }
    private boolean helper(TreeNode node,int k,HashSet<Integer> hs){
        if(node==null){
            return false;
        }
        if(hs.contains(k-node.val)){
            return true;
        }
        hs.add(node.val);
        
        return helper(node.left,k,hs) || helper(node.right,k,hs);
    }
}