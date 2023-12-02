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
/*
finding the node where cycle starts cycle

steps:
find length of the cycle
move s ahead by length of cycle times
move s and f pointers by one ,it will meet at start
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode node=head;
        ListNode slow=head;
        ListNode fast=head;
        int length=len(head,slow,fast);
        System.out.println(length);
        return loc(head,length);
    }
    
    public int len(ListNode node,ListNode slow,ListNode fast){
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length=length+1;
                }while(temp!=slow);
                return length;
                
            }
            
        }
        
        return 0;
    }
    
    public ListNode loc(ListNode node,int length){
        if(length==0){
            return null;
        }
        
        ListNode fir=node;
        ListNode sec=node;
        
        while(length>0){
            sec=sec.next;
            length--;
        }
        
        while(fir!=sec){
            fir=fir.next;
            sec=sec.next;
        }
        return fir;
        
        
    }
    
}