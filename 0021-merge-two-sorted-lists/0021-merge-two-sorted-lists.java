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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode();
        ListNode ans=res;
        ListNode f=list1;
        ListNode s=list2;
        
        while(f!=null && s!=null){
            if(f.val<s.val){
                ans.next=f;
                f=f.next;
            }
            else{
                ans.next=s;
                s=s.next;
            }
            ans=ans.next;
        }
        
        if(f!=null){
            ans.next=f;
            f=f.next;
        }
        if(s!=null){
            ans.next=s;
            s=s.next;
        }
        return res.next;   
    } 
 
}