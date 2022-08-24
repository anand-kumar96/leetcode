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
        ListNode curr=head;
        ListNode prev=null;
        int count=0;
        while(curr!=null && count<k){
          ListNode temp=curr.next;
          curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        ListNode dummy=curr;
        count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        curr=dummy;
        if(head!=null && count>k-1){
            head.next=reverseKGroup(curr,k);
        }else{
            head.next=dummy;
             while(dummy!=null){
             dummy=dummy.next;
        }
        }
        return prev;
    }
}
