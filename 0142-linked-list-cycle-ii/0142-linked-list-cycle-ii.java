/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        // ListNode curr=head;
        // int i=0;
        // while(curr!=slow){
        //     curr=curr.next;
        //     i++;
        // }
        // return i;
        if(fast.next==null || fast.next.next==null){
            return null;
        }
        while(head!=slow){
            head=head.next;
            slow=slow.next;
        }
        return head;
    }
}