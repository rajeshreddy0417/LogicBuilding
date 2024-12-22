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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode node=head;
        int len=1;
        while(node.next!=null){
            node=node.next;
            len++; 
        }
        node.next=head;
        k=k%len;
        
        ListNode p=head;
        for(int i=1;i<len-k;i++){
            p=p.next;
        }
        ListNode q=p.next;
        
        p.next=null;
        return q;
    }
}