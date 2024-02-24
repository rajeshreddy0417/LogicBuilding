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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            int len=que.size();
            List<Integer> sa=new ArrayList<>(len);
            for(int i=0;i<len;i++){
                TreeNode currentNode=que.poll();
                sa.add(currentNode.val);
                if(currentNode.left!=null){
                    que.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    que.offer(currentNode.right);
                }
            }
            ans.add(sa);
        }
        return ans;
    }
}