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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] arr={0};
        fun(root,arr);
        return arr[0];     
        
    }
    public int fun(TreeNode node,int[] arr){
        if(node==null){
            return 0;
        }
        //arr[0]=Math.min(arr[0],col);
        //arr[1]=Math.max(arr[0],col);
        int ld=fun(node.left,arr);
        int rd=fun(node.right,arr);
        arr[0]=Math.max(arr[0],ld+rd);
        
        return 1+Math.max(ld,rd);
    }
}