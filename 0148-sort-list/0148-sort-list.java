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
    public ListNode sortList(ListNode head) {
        ListNode node=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(node!=null){
            arr.add(node.val);
            node=node.next;
        }
        Collections.sort(arr);
        node=head;
        
        for(int i=0;i<arr.size();i++){
            node.val=arr.get(i);
            node=node.next;
        }
        return head;
    }
}