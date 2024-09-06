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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
        }
        ListNode node=head;
        ListNode prev=null;
        while(node!=null){
            if(hm.contains(node.val)){
                if(prev==null){
                    head=head.next;
                }else{
                    prev.next=node.next;
                    
                }
                
            }
            else{
                prev=node;
            }
            node=node.next;
            //prev=node;
        }
        return head;
    }
}