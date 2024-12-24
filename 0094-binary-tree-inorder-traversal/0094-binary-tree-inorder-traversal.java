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
        TreeNode node=root;
        
        while(node!=null){
            if(node.left==null){
                ans.add(node.val);
                node=node.right;
            }
            else{
                TreeNode curr=node.left;
                while(curr.right!=null && curr.right!=node){
                    curr=curr.right;
                }
                if(curr.right==null){
                    curr.right=node;
                    node=node.left;
                }else{
                    curr.right=null;
                    ans.add(node.val);
                    node=node.right;
                }
            }
        }
        return ans;
        
    }
}