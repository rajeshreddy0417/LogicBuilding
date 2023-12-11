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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new LinkedList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode currentNode=que.poll();
                
                if(i==size-1){
                    ans.add(currentNode.val);
                }
                if(currentNode.left!=null){
                    que.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    que.add(currentNode.right);
                }
            }
        }
        return ans;
    }
}