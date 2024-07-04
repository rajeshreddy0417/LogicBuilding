/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode node=head;
        int sum=0;
        ListNode ans=new ListNode();
        ListNode curr=ans;
        while(node!=null){
            if(node.val!=0){
                sum=sum+node.val;
            }        
            else if(node.val==0){
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
            }
            node=node.next;
        }
        ans=ans.next.next;
        return ans;
    }
}