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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return -1;
        }
        TreeNode node=root;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        List<Long> res=new ArrayList<>();
        
        while(!que.isEmpty()){
            int n=que.size();
            long ans=0;
            for(int i=0;i<n;i++){
                TreeNode c=que.poll();
                ans+=c.val;
                if(c.left!=null){
                    que.add(c.left);
                }
                if(c.right!=null){
                    que.add(c.right);                    
                }
            }
            res.add(ans);
            //ans=0;
        }
        Collections.sort(res,Collections.reverseOrder());
        if(k>res.size()){
            return -1;
        }
        return res.get(k-1);
    }
}