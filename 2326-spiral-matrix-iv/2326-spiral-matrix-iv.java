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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr=new int[m][n];
        int len=0;
        ListNode node=head;
        while(node!=null){
            len=len+1;
            node=node.next;
        }
        int l=0;
        int r=n-1;
        int t=0;
        int b=m-1;
        for(int i=0;i<m;i++){
            Arrays.fill(arr[i],-1);
        }
        node=head;
        while(len>0 && t <= b && l <= r){
            //left to right
            for(int i=l;i<=r  && node != null;i++){
                arr[t][i]=node.val;
                node=node.next;
                len--;
            }
            t++;
            //top to bottom
            for(int i=t;i<=b  && node != null;i++){
                arr[i][r]=node.val;
                node=node.next;
                len--;
            }
            r--;
            //right to left
            for(int i=r;i>=l && node != null;i--){
                arr[b][i]=node.val;
                node=node.next;
                len--;
            }
            b--;
            //bottom to top
            for(int i=b;i>=t && node != null;i--){
                arr[i][l]=node.val;
                node=node.next;
                len--;
            }
            l++;
        }
        return arr;
    }
}