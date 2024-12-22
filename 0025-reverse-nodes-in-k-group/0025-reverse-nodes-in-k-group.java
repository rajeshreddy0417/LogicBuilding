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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode ref=new ListNode(0);
        ListNode ans=ref;
        ListNode node=head;
        ref.next=head;
        
        while(node!=null){
            Stack<ListNode> que = new Stack<>();
            ListNode temp=node;
            for(int i=0;i<k;i++){
                if(temp==null){
                    break;
                }
                que.push(temp);
                temp=temp.next;
            }
            if(que.size()<k){
                ans.next=node;
                break;
            }
            while(!que.isEmpty()){
                ans.next=que.pop();
                ans=ans.next;
            }
            ans.next=temp;
            node=temp;
        }
        return ref.next;
    }
}